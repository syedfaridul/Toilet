# Toilet Login XML

{% embed url="https://github.com/sushen/Toilet/commit/0cfcf08c4812557cd0939b54e28c9bb64290be8f" %}

```text
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    android:weightSum="6"
    tools:context=".MainActivity">

    <ImageView
        android:layout_width="wrap_content"
        android:layout_height="100dp"
        android:layout_weight="2"
        android:scaleType="fitCenter"
        android:src="@drawable/logo_toilet_hunter">

    </ImageView>

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:paddingTop="10dp"
        android:text="@string/Welcome_To_Toilet_Hunter"
        android:textColor="@color/colorPrimaryDark"
        android:textSize="24sp" />

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_weight="1"
        android:orientation="vertical">


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="Usermane"
            android:textColor="@color/colorPrimaryDark"
            android:textSize="18sp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="Login"
            android:textColor="@color/colorPrimaryDark"
            android:textSize="18sp" />

        <Button
            android:id="@+id/sign_in"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="signin"
            android:text="Sign in"></Button>

    </LinearLayout>


    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_weight="1"
        android:orientation="vertical">


        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="Or"
            android:textColor="@color/colorPrimaryDark"
            android:textSize="24sp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:text="Login With"
            android:textColor="@color/colorPrimaryDark"
            android:textSize="18sp" />

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_weight="1"
        android:orientation="horizontal"

        android:paddingBottom="10dp">

        <Button
            android:id="@+id/facebook"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="Facebook"
            android:text="Facebook">></Button>

        <Button
            android:id="@+id/google"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="Google"
            android:text="Google">></Button>

        <Button
            android:id="@+id/github"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:onClick="Github"
            android:text="Github">>
        </Button>

    </LinearLayout>


</LinearLayout>
```

