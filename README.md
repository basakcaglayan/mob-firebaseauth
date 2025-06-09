# MOB - Educational Android App for Kids

MOB is an Android mobile application written in Kotlin designed to help children learn and improve fundamental skills such as seasons, months, reading the clock, reading speed, counting, summation, and more. 

The app leverages Firebase Authentication for user login and signup, providing a smooth and secure user experience.

---

## 🎯 Purpose

This app is specially created for children to support their early learning journey with interactive and fun educational content, including:

- Learning **seasons** and **months**
- Reading and understanding the **clock**
- Improving **reading speed**
- Basic **counting** and **summation**

---

## 🛠️ Technology Stack

- **Kotlin** (Current Version: 1.7.20)
- **AndroidX Support**
- Firebase Authentication
- Android Studio Arctic Fox | 2020.3.1 or higher

---

## 📱 SDK Versions

| Parameter           | Version   |
|---------------------|-----------|
| compileSdkVersion   | 33        |
| buildToolsVersion   | 30.0.3    |
| minSdkVersion       | 23        |
| targetSdkVersion    | 33        |

---

## 📚 Libraries Used

- **Retrofit** – For REST API calls  
  [https://square.github.io/retrofit/](https://square.github.io/retrofit/)
- **Glide** – Image loading and caching  
  [https://github.com/bumptech/glide](https://github.com/bumptech/glide)
- **Material Design Components** – Google’s latest UI components  
  [https://material.io/develop/android](https://material.io/develop/android)
- **Koin** – Dependency Injection  
  [https://insert-koin.io/](https://insert-koin.io/)
- **Figma design guidelines** – To ensure accurate UI implementation  
  [https://docs.dhiwise.com/docs/Designguidelines/intro](https://docs.dhiwise.com/docs/Designguidelines/intro)

---

## 🗺️ App Navigation

You can check your app’s UI flow from the **AppNavigation** screens integrated within the app.

---

## 📂 Package Structure

```plaintext
├── appcomponents       
│   ├── di                 # Dependency Injection Components 
│   │   └── MyApp.kt
│   ├── network            # REST API call setup
│   │   ├── ResponseCode.kt
│   │   └── RetrofitProvider.kt
│   └── ui                 # Data Binding Utilities
│       └── CustomBindingAdapter.kt
├── constants              # Constant Files
│   ├── IntegerConstants.kt
│   └── StringConstants.kt
├── extensions             # Kotlin Extension Functions
│   └── Strings.kt
├── modules                # Application-specific code
│   └── example            # Module of the application
│       ├── ui             # UI handling classes
│       └── data           # Data handling classes
│           ├── viewmodel  # ViewModels for UI
│           └── model      # Models for UI
└── network                # REST API setup
    ├── models             # Request/Response models
    ├── repository         # Network repository
    ├── resources          # Common API helper classes
    └── RetrofitService.kt
```
## 💡 Notes
- Designed with kids’ learning in mind, the app is simple, interactive, and safe.
- Firebase Authentication ensures secure user management.
- Follow the Figma design guidelines to maintain UI accuracy.


## 📄 License

This project is intended for academic and learning purposes. Feel free to modify and enhance it!
## 🙏 Acknowledgements

Thanks to all the open-source libraries and tools that make this app possible!

