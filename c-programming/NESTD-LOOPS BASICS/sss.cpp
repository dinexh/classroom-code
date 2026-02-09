#include <stdio.h>

// Function to display the current scores
void displayScores(int team1Score, int team2Score) {
    printf("Team 1: %d\n", team1Score);
    printf("Team 2: %d\n", team2Score);
}

int main() {
    int team1Score = 0;
    int team2Score = 0;
    int choice;

    while (1) {
        printf("1. Increment Team 1 score\n");
        printf("2. Increment Team 2 score\n");
        printf("3. Display Scores\n");
        printf("4. Quit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                team1Score++;
                printf("Team 1 scores!\n");
                break;
            case 2:
                team2Score++;
                printf("Team 2 scores!\n");
                break;
            case 3:
                displayScores(team1Score, team2Score);
                break;
            case 4:
                printf("Exiting the score tracker. Final scores:\n");
                displayScores(team1Score, team2Score);
                return 0;
            default:
                printf("Invalid choice. Please try again.\n");
        }
    }

    return 0;
}
