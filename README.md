# FYP: Code Plagiarism Detection and Generative AI

## Abstract
Code plagiarism is an issue in computer science education, and as a result various techniques have been proposed to handle this issue. With the rise of AI-driven code generation tools, traditional plagiarism detection methods face new challenges, especially in academia. AI-generated code can exhibit structural similarities to human-written code while maintaining syntactical variations. This project explores plagiarism detection in the context of both human-written and AI-generated code, aiming to develop and evaluate an algorithm inspired by the Measure of Software Similarity (MOSS).

The MOSS algorithm uses token-based analysis, which generates fingerprints for code samples, and uses various similarity functions to assess similarity. Evaluated against a dataset of plagiarised and non-plagiarised Java code, the algorithm demonstrated high precision and recall in identifying plagiarism.

While standard techniques effectively detect direct plagiarism, AI-generated code introduces a new challenge, as individual code samples may not always be distinguishable from human-written ones. However, this research hypothesizes that AI-generated code exhibits detectable patterns when analyzed at scale, as multiple AI-generated solutions for the same task tend to share underlying similarities. By conducting large-scale similarity comparisons, the study aims to determine whether AI-generated code can be systematically identified. The findings highlight the importance of integrating multiple similarity metrics for more robust detection and lays the groundwork for improving plagiarism detection tools in the era of AI-assisted programming.

## Introduction
(Background information and introduction to the problem)
The primary goal of this report is to address the growing challenge of detecting plagiarism in AI-generated code by researching, implementing, and evaluating a plagiarism detection algorithm. This project aims to assess the effectiveness of an existing algorithm when applied to both human-written and AI-generated code, thereby highlighting any limitations and strengths of current methods.

The algorithm used in this study is representative of a distinct approach to plagiarism detection. Due to its popularity and significance in education the **MOSS (Measure of Software Similarity)** algorithm was used, this is a tokenization and fingerprinting algorithm. The MOSS algorithm works by breaking down code into 'fingerprints' and comparing the frequency and arrangement of those fingerprints to detect similarities using a method called winnowing.

## Usage
(How to use tool?)

## Algorithm/Methodology
(Description of your plagiarism detection approach)
MOSS's winnowing method works by generating tokens of the input code and generating k-grams, which are contiguous sequences of k tokens. A hash value is computed for each k-gram, and a fingerprint is created by selecting specific hashes based on the window size. These fingerprints are then compared to determine similarity. This approach is robust against techniques like renaming variables or changing the order of non-essential code blocks.

The system architecture of this project is structured into two main components: **MOSS-based fingerprint generation** and **Similarity comparison**. By separating the fingerprint generation from the similarity comparison, the system ensures modularity, allowing for flexibility in adjusting detection/comparison methods. The **MOSS class** serves as the core of the process and generates a unique fingerprint for code input. Once fingerprints are generated, the **Comparator class** analyses the similarity between two fingerprints and produces a similarity score.

## Dataset
(Information about the dataset used)
The human-written source code plagiairism dataset retrieved from (Source Code Plagiarism Dataset) [Link](https://github.com/oscarkarnalim/sourcecodeplagiarismdataset)
. The dataset consists of 467 Java source code files covering seven different programming tasks. Each task contains three directories. 'Original' contains the original code task, 'non-plagiarized' contains N-subdirectories each representing one code file, 'plagiarized' contains six sub-directories representing the plagiarism levels from Faidhi1987.
The details of the dataset can be seen in the [corresponding paper](https://infedu.vu.lt/journal/INFEDU/article/16/info).

The AI-generated code dataset consists of seven directories for each of the programming tasks, each has two subdirectories 'Naive' and 'Adaptations'. The 'Naive' directory, was populated using ChatGPT, where the tasks were given directly as prompts and the solutions were used to create code samples. The 'Adaptations' dataset was populated by giving ChatGPT its previous solutions and prompting it to make adaptations by using different approaches for each code sample, this was done to introduce variation.


## Results
(Summary of the evaluation results)
The results of the AI self-similarity experiments indicate that AI-generated code samples, particularly in the 'Naive' dataset, tend to exhibit a high degree of similarity. This suggests that AI models often produce consistent patterns. The 'Adaptations', which was designed to introduce variation, resulted in a more dispersed similarity distribution, indicating that modifying the prompt or approach can reduce direct similarities between the AI-generated code samples, making it more difficult to identify AI-generated code.

The findings indicate that while existing techniques like MOSS can effectively detect direct plagiarism, AI-generated code requires more nuanced strategies. One of the deficiencies of a token-based algorithm like MOSS is that it struggles in identifying deep structural similarities, it fails to handle logically equivalent but syntactically different code samples.

## Contact
Peace Samuel, UCC

## Acknowledgements
Dr. Kieran Herley
