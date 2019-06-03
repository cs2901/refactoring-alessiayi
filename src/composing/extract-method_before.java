void printOwing() {
  printBanner();
  printDetails(getOustanding())

}

void printDetail (double outstanding){
        // Print details.
        System.out.println("name: " + name);
        System.out.println("amount: " + outstanding);
}