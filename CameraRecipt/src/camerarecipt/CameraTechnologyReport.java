/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camerarecipt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ST10437711
 */
public class CameraTechnologyReport {

    public static void main(String[] args) {
        // Create a list to store the camera data
        List<Camera> cameras = new ArrayList<>();
        cameras.add(new Camera("CANON", 10500.00, 8500.00));
        cameras.add(new Camera("SONY", 9500.00, 7200.00));
        cameras.add(new Camera("NIKON", 12000.00, 8000.00));

        // Display the Camera Technology Report
        System.out.println("--------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-10s %-15s %-15s\n", " ", "MIRRORLESS", "DSLR");
        for (Camera camera : cameras) {
            System.out.printf("%-10s R %-13.2f R %.2f\n", camera.getBrand(), camera.getMirrorlessPrice(), camera.getDslrPrice());
        }

        // Display the Camera Technology Results
        System.out.println("--------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("--------------------------------------------------");

        Camera maxDifferenceCamera = null;
        double maxDifference = 0.0;

        for (Camera camera : cameras) {
            double difference = camera.calculatePriceDifference();
            System.out.printf("%-10s R %.2f\n", camera.getBrand(), difference);

            // Check if the current camera has the max difference
            if (difference > maxDifference) {
                maxDifference = difference;
                maxDifferenceCamera = camera;
            }
        }

        // Highlight the camera with the most cost difference
        System.out.println("--------------------------------------------------");
        System.out.printf("%s R %.2f ***\n", maxDifferenceCamera.getBrand(), maxDifference);

        // Show the camera with the most cost difference
        System.out.println("--------------------------------------------------");
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + maxDifferenceCamera.getBrand());
        System.out.println("--------------------------------------------------");
    }
}