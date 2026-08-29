public class ThreeInOne {
  private int numberOfStacks = 3;
  private int stackCapacity;
  private int[] values;
  private int[] sizes;//stores the size of stacks; for example sizes = new int[numberOfStack=3];

  public ThreeInOne(int stackSize) {

    stackCapacity=stackSize;
    values= new int[numberOfStacks*stackCapacity];
    sizes = new int[numberOfStacks];
  
  }

  // isFull
  public boolean isFull(int stackNum) {// stack num is Index oF stack 
    return sizes[stackNum]==stackCapacity;
  }

  // isEmpty
  public boolean isEmpty(int stackNum) {
      // TODO
      return sizes[stackNum] == 0;// stack num ==0 return true;
  }

  // indexOfTop - this is helper method for push, pop and peek methods

  private int indexOfTop(int stackNum) {
    int offset = stackNum * stackCapacity;
    int size = sizes[stackNum];
    return offset+size-1;
  }
  //EXPLANATION |
  //            |
  //            V 
  /*
 * Finds the array index of the top element in a particular stack.
 *
 * All 3 stacks share one array. Each stack gets a fixed section
 * of the array based on stackCapacity.
 *
 * Example: stackCapacity = 4
 *
 * Stack 0 uses indexes: 0 to 3
 * Stack 1 uses indexes: 4 to 7
 * Stack 2 uses indexes: 8 to 11
 *
 * offset tells us where the selected stack starts:
 * offset = stackNum * stackCapacity
 *
 * size tells us how many elements are currently in that stack.
 *
 * The top element is at:
 * offset + size - 1
 *
 * Example:
 * For stackNum = 1 and stackCapacity = 4:
 * offset = 1 * 4 = 4
 *
 * If sizes[1] = 3, its values are at indexes 4, 5, and 6.
 * Therefore, the top element is at:
 * 4 + 3 - 1 = 6
 */

  // push
  public void push(int stackNum, int value) {
    if(isFull(stackNum)){
        System.out.println("IS FULL");

    }
    else{
        sizes[stackNum]++;
        values[indexOfTop(stackNum)]=value;
    }
  }

  // pop
  public int pop(int stackNum) {
    if(isEmpty(stackNum)){
        return -1;
    }
    else{
        int value = values[indexOfTop(stackNum)];
        sizes[stackNum]--;
        return value;
    }
  }

  // peek

  public int peek(int stackNum) {
    return values[indexOfTop(stackNum)];
  }

}
