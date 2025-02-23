import java.util.*;

public class PlaceFinder {
    static class Device {
        int id;
        List<Connection> connections = new ArrayList<>();

        public Device(int id) {
            this.id = id;
        }
    }

    static class Connection {
        int deviceId;
        double distance;
        double angle; // in degrees

        public Connection(int deviceId, double distance, double angle) {
            this.deviceId = deviceId;
            this.distance = distance;
            this.angle = angle;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); // consume the rest of the line

        // Step 1: Read device data
        Map<Integer, Device> devices = new HashMap<>();
        String[] deviceData = scanner.nextLine().split(" ");
        for (String data : deviceData) {
            String[] parts = data.split(":");
            int deviceId = Integer.parseInt(parts[0]);
            int numConnections = Integer.parseInt(parts[1]);
            devices.put(deviceId, new Device(deviceId));
        }

        // Step 2: Read connections for each device
        for (int i = 0; i < N; i++) {
            int deviceId = scanner.nextInt();
            int numConnections = devices.get(deviceId).connections.size(); // number of connections
            scanner.nextLine(); // consume the rest of the line

            for (int j = 0; j < numConnections; j++) {
                int targetId = scanner.nextInt();
                double distance = scanner.nextDouble();
                double angle = scanner.nextDouble();
                devices.get(deviceId).connections.add(new Connection(targetId, distance, angle));
                scanner.nextLine(); // consume the rest of the line
            }
        }

        // Read the two devices to find distance between
        int device1Id = scanner.nextInt();
        int device2Id = scanner.nextInt();

        // Step 3: Calculate positions
        Map<Integer, double[]> positions = new HashMap<>();
        positions.put(device1Id, new double[]{0.0, 0.0}); // position of the first device (origin)

        // BFS to calculate positions
        Queue<Integer> queue = new LinkedList<>();
        queue.add(device1Id);
        Set<Integer> visited = new HashSet<>();
        visited.add(device1Id);

        while (!queue.isEmpty()) {
            int currentId = queue.poll();
            Device currentDevice = devices.get(currentId);
            double[] currentPosition = positions.get(currentId);

            for (Connection connection : currentDevice.connections) {
                if (!visited.contains(connection.deviceId)) {
                    double angleRad = Math.toRadians(connection.angle);
                    double x = currentPosition[0] + connection.distance * Math.cos(angleRad);
                    double y = currentPosition[1] + connection.distance * Math.sin(angleRad);
                    positions.put(connection.deviceId, new double[]{x, y});
                    queue.add(connection.deviceId);
                    visited.add(connection.deviceId);
                }
            }
        }

        // Debugging output
        System.out.println("Visited devices: " + visited);
        System.out.println("Calculated positions: " + positions);

        // Step 4: Calculate distance between device1Id and device2Id
        double[] pos1 = positions.get(device1Id);
        double[] pos2 = positions.get(device2Id);

        // Check if both devices have positions calculated
        if (pos1 == null || pos2 == null) {
            System.out.println("Distance could not be calculated. One of the devices might not be reachable.");
            return;
        }

        double distance = Math.sqrt(Math.pow(pos2[0] - pos1[0], 2) + Math.pow(pos2[1] - pos1[1], 2));

        // Step 5: Output the distance rounded to two decimal points
        System.out.printf("%.2f\n", distance);
    }
}
