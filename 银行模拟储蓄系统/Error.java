package 银行模拟储蓄系统;

//自定义异常类
class InvalidAccountException extends Exception {
 public InvalidAccountException(String message) {
     super(message);
 }
}

class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

class TransferLimitException extends Exception {
 public TransferLimitException(String message) {
     super(message);
 }
}