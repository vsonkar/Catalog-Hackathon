
import java.util.ArrayList;

class Block {

    public String hash;
    public String previousHash;
    String data;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.hash = calculateHash();
    }

    public String calculateHash() {
        return Integer.toString((previousHash + data).hashCode());
    }
}

class Blockchain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();

    public static void main(String[] args) {
        // Adding blocks to the blockchain
        blockchain.add(new Block("Drug batch 1 details", "0"));
        blockchain.add(new Block("Drug batch 2 details", blockchain.get(blockchain.size() - 1).hash));
        blockchain.add(new Block("Drug batch 3 details", blockchain.get(blockchain.size() - 1).hash));

        for (Block block : blockchain) {
            System.out.println("Block:");
            System.out.println("Hash: " + block.hash);
            System.out.println("Previous Hash: " + block.previousHash);
            System.out.println("Data: " + block.data);
            System.out.println();
        }
    }
}
