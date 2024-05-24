package AccessModifiers;

class PrivateClass {
    private void display() {
        System.out.println("This is the private access specifier.");
    }

    void showPrivate() {
        display(); // Accessible within the same class
    }
}

	// In this example, we have created two classes . PrivateAccessModifier class contains
	// private data member and private method. We are accessing these private
	// members from outside the class, so there is a compile-time error
