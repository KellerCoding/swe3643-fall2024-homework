# Fall 2024 SWE 3643 Testing and QA Homework 2
## Kahmin Keller

1. **Perform Branch Analysis**<br/>
   Study a block of pseudocode and convert it to a graph showing every possible path
2. **Convert Pseudocode to Operational Code**<br/>
   Convert the pseudocode to the language of your choice
3. **Write Unit Tests**<br/>
   Write unit tests to achieve 100% coverage of every branch
4. **Perform Coverage Analysis**<br/>
   Execute coverage analysis in your JetBrains IDE
5. **Check-in Homework 2 to your GitHub Homework Repository**<br/>
   Practice submitting completed code with a README to your source control repository


## flowchart of Standard Deviation Code

```mermaid
title: HW Chart

flowchart TD

start(((COMPUTE_MEAN))) --> isEmpty
isEmpty --> |Yes| raiseError
isEmpty --> |No| sumAcc
sumAcc --> |For each value in List| iterate
sumAcc --> return


sumAcc(int sum)
iterate[[sum=sum+value]]
raiseError(valuesList parameter cannot be null or empty)
return(return sum/List.length)