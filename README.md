![Java](https://img.shields.io/badge/language-Java-blue.svg)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# SecureChat

A simple multi-client chat application built in Java using sockets and threads.

## Features

- Multi-client chat server
- Threaded client handlers
- Broadcast messaging
- Command-line interface (CLI) based

## Getting Started

### Prerequisites

- Java JDK 17+
- (Optional) Docker for containerized running

### Running without Docker

1. Compile the source files:

   ```bash
   javac -d out src/server/*.java src/client/*.java
### Run the server:

bash
Copy
Edit
java -cp out server.Server
Run the client (in a new terminal):

bash
Copy
Edit
java -cp out client.Client
Running with Docker
Build the Docker image:

bash
Copy
Edit
docker build -t javachat .
Run the server container (exposing port 5000):

bash
Copy
Edit
docker run -p 5000:5000 javachat
Run the client container (optional):

bash
Copy
Edit
docker run -it --rm javachat java -cp out client.Client
Note: The Dockerfile runs the server by default. Use the command override to run the client.

### Project Structure

JavaChat/
├── src/
│ ├── server/
│ │ ├── Server.java
│ │ └── ClientHandler.java
│ └── client/
│ └── Client.java
├── README.md
├── Dockerfile
├── .gitignore
├── LICENSE
├── build.sh
├── run-server.sh
└── run-client.sh

---
### License
This project is licensed under the MIT License - see the LICENSE file for details.
