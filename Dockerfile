# Use official OpenJDK runtime
FROM openjdk:17-jdk-alpine

# Set working directory inside the container
WORKDIR /app

# Copy source code into container
COPY src ./src

# Compile all Java source files (server and client)
RUN javac -d out src/server/*.java src/client/*.java

# Expose port 5000 for the chat server
EXPOSE 5000

# Default command: start the server
CMD ["java", "-cp", "out", "server.Server"]
