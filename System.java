public class System {
    private PaymentGateway paymentGateway;
    private AppointmentSystem appointmentSystem;

    public System() {
        this.paymentGateway = new PaymentGateway();
        this.appointmentSystem = new AppointmentSystem();
    }

    // Method to retrieve client information
    public void retrieveClientInfo(Client client) {
        System.out.println("Fetching information for client: " + client.getClientInfo());
    }

    // Method to store new client info
    public void storeNewClientInfo(Client client, String newClientInfo) {
        System.out.println("Creating new client profile: " + newClientInfo);
    }

    // Method to update client details
    public void updateClientDetails(Client client, String newInfo) {
        client.setClientInfo(newInfo);
        System.out.println("Client information updated to: " + newInfo);
    }

    // Method to process payment via
