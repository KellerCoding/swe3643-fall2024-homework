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
flowchart TD

start(((Start Sample Standard Dev))) --> COMPUTE_SAMPLE_STANDARD_DEVIATION
start2(((Start Population Standard Dev))) --> COMPUTE_POPULATION_STANDARD_DEVIATION
COMPUTE_SAMPLE_STANDARD_DEVIATION --> |isPopulation=false| COMPUTE_STANDARD_DEVIATION
COMPUTE_STANDARD_DEVIATION --> valueList1.isEmpty
valueList1.isEmpty --> |True| raiseError
valueList1.isEmpty --> |False| COMPUTE_MEAN
COMPUTE_MEAN --> valueList2.isEmpty
valueList2.isEmpty --> |True| raiseError
valueList2.isEmpty --> |False| sumAcc
sumAcc --> |For each value in List| iterate
iterate --> sumAcc
sumAcc --> |Return sum/valueList.length| squareOfDifferences
squareOfDifferences --> valueList3.isEmpty
valueList3.isEmpty --> |True| raiseError
valueList3.isEmpty --> |False| squareAccumulator
squareAccumulator --> |For each value in List| iterate2
iterate2 --> difference[[difference=value-mean]]
difference --> squareDiff[[difference*difference]]
squareDiff --> |squareAccumulator=squareAccumulator+squareOfDifference| squareAccumulator
squareAccumulator --> |return squareAccumulator| COMPUTE_VARIANCE
COMPUTE_VARIANCE --> isPopulation
isPopulation --> |FALSE|numValues
isPopulation --> |TRUE| COMPUTE_VARIANCE
numValues --> |numValues=numValues-1|COMPUTE_VARIANCE
COMPUTE_VARIANCE --> |if numValues<1| raiseError2
COMPUTE_VARIANCE --> return(return squarOfDifferences/variance)
return --> finalreturn(return squareroot variance)
COMPUTE_POPULATION_STANDARD_DEVIATION --> |isPopulation=TRUE| COMPUTE_STANDARD_DEVIATION


raiseError2(numValues is too low sample size must be >= 2, population size must be >= 1)
sumAcc(int sum)
iterate[[sum=sum+value]]
raiseError(valuesList parameter cannot be null or empty)