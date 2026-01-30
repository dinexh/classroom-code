#include <stdio.h>

int main()
{
    int a, b, choice;

    printf("Reading the values of a and b\n");
    scanf("%d %d", &a, &b);

    printf("Enter your choice:\n");
    printf("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus\n");
    scanf("%d", &choice);

    switch (choice)
    {
        case 1:
            printf("Addition: %d\n", a + b);
            break;

        case 2:
            printf("Subtraction: %d\n", a - b);
            break;

        case 3:
            printf("Multiplication: %d\n", a * b);
            break;

        case 4:
            if (b != 0)
                printf("Division: %d\n", a / b);
            else
                printf("Division by zero not allowed\n");
            break;

        case 5:
            if (b != 0)
                printf("Modulus: %d\n", a % b);
            else
                printf("Modulus by zero not allowed\n");
            break;

        default:
            printf("Invalid choice\n");
    }

    return 0;
}

