import 'package:flutter/material.dart';
import 'pages/login_page.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      home: scaffold(
        backgroundColor: const Color.fromARGB(255, 54, 140, 184),
        appBar: AppBar(
          title: const Text('Login Page'),
          centerTitle: true,
          backgroundColor: const Color.fromARGB(255, 21, 158, 226),
        ),
      ),
      //Scaffold is a white screen.
      theme: ThemeData.light(), // Use the default light theme
    ); // Material App
  }

  scaffold({Color? backgroundColor, required AppBar appBar}) {}
}
