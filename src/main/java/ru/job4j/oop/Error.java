package ru.job4j.oop;

    public class Error {
        private boolean active;
        private int status;
        private String message;

        public Error() {
        }

        public Error(boolean active, int status, String message) {
            this.active = active;
            this.status = status;
            this.message = message;
        }

        public void printInfo() {
            System.out.println(active);
            System.out.println(status);
            System.out.println(message);
        }

        public static void main(String[] args) {
            Error warning = new Error();
            warning.printInfo();
            Error error = new Error(false, 123, "message");
            error.printInfo();
            Error notification = new Error(true, 404, "Page not found");
            notification.printInfo();
        }
    }

