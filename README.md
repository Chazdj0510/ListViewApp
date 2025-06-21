# 🍎 Fruit List Android App

An Android application that displays a scrollable list of fruits. Each fruit has a title, subtitle, and image. When tapped, a detail screen opens showing more information about the fruit.

---

## 🎯 Features

- 📋 ListView of fruits with custom titles, subtitles, and images  
- ✅ Clickable list items that open a second activity with full fruit details  
- 🔄 Explicit intents used for navigation between activities  
- 📦 Serializable data model to pass objects between screens  
- 🔙 ActionBar back arrow for smooth return navigation  
- 🔔 Snackbar confirmation on return to the main screen  
- ♿ Accessibility support with content descriptions for images

---

## 📸 Demo

🎥 [Click to view demo video](assets/ListViewApp.mp4)


---

## 🛠 Tech Stack

- Java  
- Android Studio  
- Android SDK  
- Material Components (Snackbar)

---

## 📁 Project Structure

<pre>
app/
├── java/com/example/listviewapp/
│   ├── MainActivity.java
│   ├── DetailActivity.java
│   ├── ItemAdapter.java
│   └── Item.java

├── res/layout/
│   ├── activity_main.xml
│   ├── activity_detail.xml
│   └── list_item.xml
├── res/values/
│   ├── strings.xml
│   └── themes.xml
└── drawable/
    └── fruit images (e.g., apple.png, mango.png, etc.)
</pre>

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/ListViewApp.git
2. Open the project in Android Studio
3. Build and run the app on an emulator or physical Android device
