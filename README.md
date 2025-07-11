# 🧩 KList DSL – Declarative List Builder for Jetpack Compose

A custom list-building DSL inspired by Jetpack Compose's `Modifier` pattern. This project demonstrates building reusable, declarative, and fluent UI APIs using Compose + MVVM + Clean Architecture.

## 📌 Objective

Build a fluent DSL (`KList`) that allows constructing complex list UIs in Jetpack Compose using a chaining/builder pattern:

```kotlin
KList {
    padding(16.dp)
    header("Top Gainers")
    items(coinList) {
        KListItem(it)
    }
}


