package blog.client;

import com.google.protobuf.Empty;
import com.proto.blog.Blog;
import com.proto.blog.BlogId;
import com.proto.blog.BlogServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class BlogClient {
    private static void run(ManagedChannel channel) {
        BlogServiceGrpc.BlogServiceBlockingStub stub = BlogServiceGrpc.newBlockingStub(channel);

        BlogId id = createBlog(stub);
        BlogId toDelete = createBlog(stub);

        if(id == null)
            return;;

        System.out.println(id);

        Blog blog = getBlog(stub, id.getId());

        if(id == null)
            return;

        System.out.println(blog.toString());

        updateBlog(stub, id.getId());
        blog = getBlog(stub, id.getId());
        System.out.println("After Update " + blog.toString());

        printAllBlogs(stub);
        deleteBlog(stub, toDelete);

    }

    private static void deleteBlog(BlogServiceGrpc.BlogServiceBlockingStub stub, BlogId id) {
        try {
            stub.deleteBlog(id);
        }catch (StatusRuntimeException e){
            System.out.println("Couldn't delete blog");
            e.printStackTrace();
            return;
        }
    }

    private static void printAllBlogs(BlogServiceGrpc.BlogServiceBlockingStub stub) {
        try {
            stub.getAllBlogs(Empty.getDefaultInstance()).forEachRemaining(blog -> {
                System.out.println(blog.toString());
            });
        }catch (StatusRuntimeException e){
            System.out.println("Couldn't get blogs");
            e.printStackTrace();
            return;
        }
    }

    private static void updateBlog(BlogServiceGrpc.BlogServiceBlockingStub stub, String id) {
        try {
            stub.updateBlog(
                    Blog.newBuilder()
                            .setId(id)
                            .setAuthor("Edited")
                            .setTitle("EditedTitle")
                            .setContent("EditedContent")
                            .build()
            );
        }catch (StatusRuntimeException e){
            System.out.println("Couldn't update blog");
            e.printStackTrace();
            return;
        }
    }

    private static Blog getBlog(BlogServiceGrpc.BlogServiceBlockingStub stub, String id) {
        try {
            Blog blog = stub.getBlog(BlogId.newBuilder().setId(id).build());

            return blog;
        } catch (StatusRuntimeException e){
            System.out.println("Couldn't get blog");
            e.printStackTrace();
            return null;
        }
    }

    private static BlogId createBlog(BlogServiceGrpc.BlogServiceBlockingStub stub) {
        try {
            BlogId id = stub.createBlog(
                    Blog.newBuilder()
                            .setAuthor("Author1")
                            .setTitle("Title1")
                            .setContent("Content1")
                            .build()
            );

            System.out.println("Blog create: " + id.getId());

            return id;
        }catch (StatusRuntimeException e){
            System.out.println("Couldn't create blog");
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        run(channel);

        System.out.println("Shutting down");
        channel.shutdown();
    }
}
