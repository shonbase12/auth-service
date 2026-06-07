# Unit Tests Documentation

## Overview
This document outlines the unit tests implemented for the user profile sync functionality as described in issue #44.

## Test Cases
1. **Sync User Profile to Firestore**
   - **Description**: Tests if the user profile is correctly synced to Firestore.
   - **Expected Outcome**: The profile should be stored in `users/{userId}/profile`.

2. **Restore Profile from Firestore**
   - **Description**: Tests if the profile is restored from Firestore on fresh install.
   - **Expected Outcome**: The profile should be retrieved successfully if the user re-authenticates.

3. **Conflict Resolution**
   - **Description**: Tests the conflict resolution mechanism based on last-write-wins.
   - **Expected Outcome**: The latest profile update should be retained.

4. **Offline Functionality**
   - **Description**: Tests if the application works offline using Room as the source of truth.
   - **Expected Outcome**: The profile should be accessible even without internet connection.

## Running Tests
To run the tests, use the following command:
```
./gradlew test
```

Ensure that the environment is set up correctly before executing the tests.

## Conclusion
This documentation serves as a guide for understanding and executing the unit tests related to the user profile sync functionality.