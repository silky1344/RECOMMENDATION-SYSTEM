# RECOMMENDATION-SYSTEM
NAME- SILKYSHARMA

DURATION- 4 WEEKS

DOMAIN- JAVA PROGRAMMING 

MENTOR- NEELAM SANTOSH
This project is a simple yet effective recommendation system developed in the Java programming language, implementing user-based collaborative filtering. The goal of the system is to suggest relevant items (like products, books, or movies) to users based on the preferences of other users with similar tastes. This type of system is widely used in platforms such as Amazon, Netflix, and YouTube to personalize content and enhance user engagement.The system uses Pearson Correlation to calculate similarity between users. Pearson Correlation is a statistical method that measures the linear correlation between two variables — in this case, the ratings given by two different users. A higher correlation implies that the users have similar tastes.

DataLoader.java: This class contains hardcoded sample data in the form of a nested map. Each user is mapped to a set of item ratings. The data simulates a real-world scenario where users rate different items based on their preferences.

Similarity.java: This class is responsible for computing the Pearson Correlation coefficient between two users. It extracts the common items both users have rated and uses a mathematical formula to compute the correlation score, which ranges from -1 to +1. A positive score indicates similarity in taste, whereas a negative score indicates dissimilarity.

Recommender.java: This is the core logic of the recommendation engine. It loops through all other users to compare them with the target user. If the similarity score is positive, the program looks at items rated by the similar user but not yet rated by the target user. These items are added to a recommendation list with a predicted score calculated by weighted average based on similarity scores.

Main.java: This is the entry point of the application. It initializes the dataset, invokes the recommender logic, and displays the recommended items along with predicted scores for the selected user (e.g., “Alice”).
