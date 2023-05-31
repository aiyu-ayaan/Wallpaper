# Wallpaper
<img src="https://github.com/aiyu-ayaan/Wallpaper/assets/76834976/21996884-ec25-4d01-9201-1bf176c15efe" height="500"/>

This is a Wallpaper app that allows users to browse and download wallpapers from the internet. It utilizes the `https://jsonplaceholder.typicode.com/photos` API to fetch wallpapers and display them in a grid.

## Architecture
The app follows the MVVM (Model-View-ViewModel) architectural pattern. It separates the app into three main components:

- Model: Represents the data and business logic of the app.
- View: Handles the user interface and user interactions.
- ViewModel: Acts as a mediator between the Model and the View, providing data to the View and handling user actions.

## API Calls
The app uses Retrofit to make API calls to the https://jsonplaceholder.typicode.com/photos endpoint. The API service interface and network configuration can be found in the api package.

## Image Loading
The app utilizes Coil, an image loading library, to load and display wallpapers efficiently. Coil handles image caching, placeholder management, and provides an easy-to-use API for loading images. The image loading logic can be found in the image package.

## Dependency Injection
To improve code modularity and testability, the app utilizes dependency injection. Dagger or Hilt can be used to set up dependency injection in the app.
