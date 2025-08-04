![Java](https://img.shields.io/badge/language-Java-blue.svg)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# 💬 SecureChat — Multi-Client Console Chat in Java

JavaChat is a terminal-based, multi-client chat system built using **Java Sockets**. It allows multiple clients to connect to a central server and communicate in real time via broadcast messages.

This project is ideal for learning:
- Basic networking in Java
- Multithreading
- Server-client architecture

---

## 🧱 Project Structure
## 
JavaChat/
├── src/
│ ├── server/
│ │ ├── Server.java
│ │ └── ClientHandler.java
│ └── client/
│ └── Client.java
├── out/ # Compiled class files
├── README.md
└── .gitignore

yaml
Copy
Edit

---

## 🚀 Features

- ✅ Multi-client support (thread per client)
- 📢 Broadcast messages to all connected users
- 🧵 Threaded server using `ClientHandler`
- 👋 Graceful client disconnection
- 💯 100% pure Java, no libraries

---

## 🛠 Requirements

- Java JDK 8 or higher
- Terminal or shell (e.g., Bash, CMD, PowerShell)

---

## 🧪 How to Run the App

Open a terminal in the project root (`JavaChat/`):

### 🧰 Compile

```bash
javac -d out src/server/*.java src/client/*.java
🔌 Start the Server
bash
Copy
Edit
java -cp out server.Server
The server will now listen on port 5000 for incoming clients.

💬 Start One or More Clients (in separate terminals)
bash
Copy
Edit
java -cp out client.Client
Each client will connect to the server and start chatting. Messages sent from one client will be broadcast to all others.

🖼 Example
Terminal 1 (Server)
vbnet
Copy
Edit
Server started. Listening on port 5000...
New client connected: /127.0.0.1:60544
Received: Hello from client!
Terminal 2 (Client A)
pgsql
Copy
Edit
Connected to chat server.
Welcome! You can now start chatting.
Hello from client!
[127.0.0.1:60545]: Hi there!
Terminal 3 (Client B)
pgsql
Copy
Edit
Connected to chat server.
Welcome! You can now start chatting.
Hi there!
📈 Roadmap
Here’s how you can take it further:

 Add usernames and nicknames

 Private messages (/pm user message)

 GUI with JavaFX or Swing

 Save chat logs to file

 Encryption with SSL/TLS or AES

🛡️ License
This project is open source under the MIT License.



🤝 Contributions
Contributions are welcome! Fork, make changes, and submit a pull request.

🙋‍♂️ Questions?
Open an issue on GitHub or drop a message.

yaml
Copy
Edit

---

## 📄 2. `.gitignore` (Optional but Recommended)

Create a file named `.gitignore` in the root folder and add:

Ignore compiled class files and output folder
/out/
/*.class

Ignore OS or editor-specific files
.DS_Store
*.swp
*.log
*.iml

yaml
Copy
Edit

---

## 📄 3. (Optional) LICENSE File

Would you like me to generate a basic `LICENSE` file (MIT, Apache 2.0, GPL, etc.)? MIT is the most permissive and easiest for small projects.

---

## 📤 4. Push to GitHub

```bash
git init
git add .
git commit -m "Multiclient Java Chat App"
git remote add origin https://github.com/YOUR_USERNAME/JavaChat.git
git push -u origin master





