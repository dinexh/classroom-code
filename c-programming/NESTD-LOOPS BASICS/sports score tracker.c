#include <stdio.h>
#include<string.h>
// Function to display the menu
void displayMenu() {
    printf("\nCricket Score Tracker\n");
    printf("1. Start a new innings\n");
    printf("2. Format of your game is (T20 or ODI)\n");
    printf("3. Update score\n");
    printf("4. Display score\n");
    printf("5. Exit\n");
    printf("Choose an option: ");
}

int main() {
    int option, teamAScore = 0, teamBScore = 0, overs = 0, wickets = 0; 
    char format;
   

    do {
        displayMenu();
        scanf("%d", &option);

        switch (option) {
            case 1:
                // Start a new innings
                teamAScore = 0;
                teamBScore = 0;
                overs = 0;
                wickets = 0;
                printf("New innings started!\n");
                break;
                
            case 2:
            	// T20 OR ODI
            	printf("Enter the format of game (T20 = T OR ODI = O)\n");
            	scanf("%c",format);
            	char over=(format=='T')?20:50;
            	printf("No.of overs is %c\n",over);
            	break;
            	
		    case 3:
                // Update score
                printf("Enter the runs scored in the current over for Team A: ");
                int runsInOver;
                scanf("%d", &runsInOver);
                teamAScore += runsInOver;

                printf("Enter the wickets fallen in the current over for Team B: ");
                int wicketsInOver;
                scanf("%d", &wicketsInOver);
                wickets += wicketsInOver;

                printf("Score updated!\n");
                break;

            case 4:
                // Display score
                printf("Team A: %d runs\n", teamAScore);
                printf("Team B: %d wickets\n", wickets);
                break;

            case 5:
                // Exit the program
                printf("Exiting the Cricket Score Tracker. Goodbye!\n");
                break;

            default:
                printf("Invalid option. Please choose a valid option.\n");
        }

    } while (option != 4);

    return 0;
}
