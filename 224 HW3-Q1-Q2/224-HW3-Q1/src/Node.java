//-----------------------------------------------------------------------------------------------------------------------------------
// Title: Node class
// Authors: Begüm Þara Ünal - Giray Berk Kuþhan 
// ID: 10096206194 - 10889878942
// Section: 4
// Assignment: 3
// Description: This is node class 
//------------------------------------------------------------------------------------------------------------------------------------
public class Node implements Comparable<Node> {
		int index, cost;

     //--------------------------------------------------------
  	// Summary:Constructor of class.
   //--------------------------------------------------------
		Node(int index, int cost) {
			this.index = index;
			this.cost = cost;
		}

	//--------------------------------------------------------
	 // Summary: This compareTo method to compare nodes
	 // Precondition: other is from Node class
	 // Postcondition: Returns comparison
	 //--------------------------------------------------------
		public int compareTo(Node other) {
			return Integer.compare(cost, other.cost);
		}
	}