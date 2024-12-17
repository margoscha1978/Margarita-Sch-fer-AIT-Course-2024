package TourismBureauManagementSystem.core;

/*
Создаем класс TourManager:
- основная задача класса - управлять информацией о турах (добавление, удаление, получение данных).
- структура класса:
  - поле для хранения списка туров (как List<Tour>).
  - методы для работы с турами:
    - void addTour(Tour tour): добавление нового тура.
    - void removeTour(String tourId): удаление тура по идентификатору.
    - Tour findTourById (String tourId): получение тура по идентификатору.
    - List<Tour> getAllTours(): получение всех туров.
 */

import TourismBureauManagementSystem.model.Tour;
import java.util.ArrayList;
import java.util.List;

public class TourManager {
    private List<Tour> tours;

    public TourManager() {
        tours = new ArrayList<>(); // Инициализация списка туров
    }

    public void addTour(Tour tour) {
        tours.add(tour);
        System.out.println("Тур добавлен: " + tour);
    }

    public boolean removeTour(String tourId) {
        Tour tour = findTourById(tourId);
        if (tour != null) {
            tours.remove(tour);
            System.out.println("Тур с ID " + tourId + " был удалён.");
            return true;
        } else {
            System.out.println("Тур с ID " + tourId + " не найден.");
            return false;
        }
    }

    public Tour findTourById(String id) {
        for (Tour tour : tours) {
            if (tour.getId().equals(id)) {
                return tour;
            }
        }
        return null; // Если тур не найден
    }

    public List<Tour> getAllTours() {
        return new ArrayList<>(tours); // Возвращаем копию списка туров
    }

} // klass ended