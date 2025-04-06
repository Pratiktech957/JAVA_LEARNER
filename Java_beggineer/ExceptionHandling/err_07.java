 class err_07 {
        // Method that declares it might throw an Exception using 'throws'
        static void withdraw(int balance, int amount) throws Exception {
            if (amount > balance) {
                // Manually throwing an exception using 'throw'
                throw new Exception("Insufficient Balance!");
            } else {
                System.out.println("Withdrawal successful. Remaining balance: " + (balance - amount));
            }
        }
    
    
        public static void main(String[] args) {
            int currentBalance = 1000;
            int withdrawAmount = 1500;
    
            try {
                err_07 .withdraw(currentBalance, withdrawAmount);
            } catch (Exception e) {
                System.out.println("Transaction failed: " + e.getMessage());
            }
        }
    
    }
    
    

