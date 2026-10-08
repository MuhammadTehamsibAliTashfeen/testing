Answer:
1. How many applications go into the training set?
it depends on dataset and there is no straight rule for it. but nearly 75% of data goes to training set
2. How many go into validation?
nealy 15% go to validation
3. How many go into testing?
15%
4. Which dataset is used to learn weights and biases?
training dataset 
5. Which dataset should you use to compare two model configurations during development?
validation dataset
6. Which dataset should be reserved for the final evaluation?
test dataset
7. Suppose:
Training accuracy = 99%
Test accuracy     = 60%

What problem might this indicate?
overfitting
8. Suppose the word malware accidentally appears in the filenames of all malicious training and test applications, and filename is given to the model as a feature. Why is the reported accuracy potentially misleading?
data leakage of file names potientially become a feature for the model to learn
9. What's the difference between a parameter and a hyperparameter?
parameters are weights and bias and hyperparameters are set by developer : and example are learning rate 
10. Most important: Why shouldn't we repeatedly examine the test-set results and modify our model based on them?
we should not examine the test set because its a final evalutions
After this, Lesson 6 will cover the confusion matrix, accuracy, precision, recall and F1 score. That's where you'll learn why saying "my malware detector has 95% accuracy" can sometimes be almost meaningless.