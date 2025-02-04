package ClassWork17.bank_accout.model.homework17;
      /*
   addPlayer(Player player): Метод добавляет игрока в систему.
   Если игрок с таким id уже существует, выводится сообщение об ошибке.
• placeBet(String playerId, double amount): Метод для размещения ставки от игрока.
  Метод находит игрока по id, проверяет его баланс и, если возможно, уменьшает баланс на указанную сумму.
• displayPlayers(): Метод для отображения текущей информации о всех игроках.
         */

import java.util.HashSet;

class CasinoSystem {
    // создаем листы для игроков, что бы система не пропускала дубликаты, защита
    private HashSet<Player> players;
    private HashSet<Game> games;

    public CasinoSystem() {
        players = new HashSet<>();
        games = new HashSet<>();
    }
    // проверка наличия или отсутствия игроков по id
    public void addPlayer(Player player) {
        if (!players.add(player)) {
            System.out.println("Игрок с таким id уже существует.");
        }
    }
    // наличие игры в списке игр
    public void addGame(Game game) {
        if (!games.add(game)) {
            System.out.println("Игра с таким названием уже существует.");
        }
    }

    public void placeBet(String playerId, String gameName, double amount) {
        Player player = findPlayerById(playerId);
        Game game = findGameByName(gameName);

        if (player != null && game != null) {
            player.placeBet(amount);
            System.out.println("Ставка на игру " + gameName + " размещена: " + amount);
        } else {
            if (player == null) {
                System.out.println("Игрок с таким id не найден.");
            }
            if (game == null) {
                System.out.println("Игра с таким названием не найдена.");
            }
        }
    }
    // начисление игровых процентов и подтверждение игры или игрока по id
    public void awardWin(String playerId, String gameName, double amount) {
        Player player = findPlayerById(playerId);
        Game game = findGameByName(gameName);

        if (player != null && game != null) {
            double winnings = amount * game.getOdds();
            player.addBalance(winnings);
            System.out.printf("Игроку %s выплачено выигрыш: %.2f%n", playerId, winnings);
        } else {
            if (player == null) {
                System.out.println("Игрок с таким id не найден.");
            }
            if (game == null) {
                System.out.println("Игра с таким названием не найдена.");
            }
        }
    }
    // ищем игрока по номеру id
    private Player findPlayerById(String playerId) {
        for (Player player : players) {
            if (player.getId().equals(playerId)) {
                return player;
            }
        }
        return null;
    }
    // поиск игры в наличии
    private Game findGameByName(String gameName) {
        for (Game game : games) {
            if (game.getName().equals(gameName)) {
                return game;
            }
        }
        return null;
    }
    // список игроков
    public void displayPlayers() {
        for (Player player : players) {
            System.out.println(player);
        }
    }
    // список игр
    public void displayGames() {
        for (Game game : games) {
            System.out.println(game);
        }
    }

} // klass ended