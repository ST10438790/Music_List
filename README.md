# Playlist App



## Overveiw

This is a basic Android app written in Kotlin that helps users create a playlist with their favorite songs. The app uses parallel arrays to store item data and provides screen navigation, input validation, and display filters.

## Features

Add song items with artist, rating and comments 

Store Data using parallel arrays 

Display Full playlist of songs 

Show only items with a higher rating than 2

simple 2-screen UI navigation

## Technologies Used

Kotlin
Android studio 
XML Layouts
Git & GitHub

## How It Works

Users tap "Add to Playlist", input item details in a dialog and submit.



```bash
Mainscreen Buttons, Images and Text
```

## Code 

```Kotlin
 <ImageView
        android:id="@+id/imageView4"
        android:layout_width="588dp"
        android:layout_height="844dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.504"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/img"/>

    <Button
        android:id="@+id/btnAdd"
        android:layout_width="123dp"
        android:layout_height="60dp"
        android:background="@color/ForestGreen"
        android:text="Add to playlist"
        android:textColor="@color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.197"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.776" />

    <Button
        android:id="@+id/btnNext"
        android:layout_width="121dp"
        android:layout_height="58dp"
        android:background="@color/ForestGreen"
        android:text="Go to playlist"
        android:textColor="@color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.762"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.777" />

    <Button
        android:id="@+id/btnExit"
        android:layout_width="239dp"
        android:layout_height="58dp"
        android:background="@color/Red"
        android:text="Exit App"
        android:textColor="@color/black"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.926" />

    <TextView
        android:id="@+id/Welcome"
        android:layout_width="322dp"
        android:layout_height="46dp"
        android:background="@color/DarkGreen"
        android:text="  Welcome to MusicList"
        android:textColor="@color/white"
        android:textSize="30dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.494"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.145" />
```



## Viewing Items (Second Activity)

Users can:

View all items with full details

View only Items with a higher rating than 2

Go back to Mainscreen 

## How It Works

Users tap the buttons shown on screen.

```bash
Secondscreen Code
```

```Kotlin
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Music_Playlist">


    <ImageView
        android:id="@+id/imageView"
        android:layout_width="658dp"
        android:layout_height="1007dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.505"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@drawable/pin2" />

    <TextView
        android:id="@+id/txtList"
        android:layout_width="372dp"
        android:layout_height="518dp"
        android:scrollbars="vertical"
        android:textColor="@color/DarkGreen"
        android:textSize="30dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.516"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.071" />

    <Button
        android:id="@+id/btnShowAll"
        android:layout_width="153dp"
        android:layout_height="54dp"
        android:text="Refresh"
        android:background="@color/DarkGreen"
        android:textColor="@color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.946"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.84" />

    <Button
        android:id="@+id/btnShowMany"
        android:layout_width="209dp"
        android:layout_height="54dp"
        android:text="Items rated 2 or more"
        android:background="@color/DarkGreen"
        android:textColor="@color/white"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.079"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.84" />

    <Button
        android:id="@+id/btnBack"
        android:layout_width="121dp"
        android:layout_height="56dp"
        android:text="Back to Main"
        android:background="@color/Red"
        android:textColor="@color/black"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.498"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.943" />


</androidx.constraintlayout.widget.ConstraintLayout>

```

## Logging

This app uses Log.d("Packing List", "Item added: $item ($qty)") for debugging

Check Logcat to trace when items are added or interactions occur.

## Project Structure

MainActivity.kt, 
Music_Playlist.kt, 
activity_main.xml, 
activity_music_playlist.xml, 
dialog_add.xml

## GitHub Repo Link

[GitHub](https://github.com/ST10438790/Music_List)

## Installation 

1.Clone the repo
2.Open in Android Studio 
3.Run on emulator or device 
