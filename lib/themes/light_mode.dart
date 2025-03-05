import 'package:flutter/material.dart';

ThemeData lightMode = ThemeData(
  colorScheme: ColorScheme.light(
    surface: Colors.grey.shade300,
    primary: Colors.grey.shade600, // Adjusted primary color
    secondary: Colors.grey.shade400, // Adjusted secondary color
    tertiary: Colors.white,
    inversePrimary: Colors.grey.shade900, // Corrected typo
  ),
);
