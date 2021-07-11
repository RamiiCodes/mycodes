package mycodes;

public class CDNbaTeams {

	public static String nba_cup(String r, String team)

	{
		String[] str = r.split(",");
		for (int i = 0; i < str.length; i++) {
			if (verify(str[i]) == false)
				return "Error(float number):" + str[i];
		}
		if (team == "")
			return "";

		String fin = "";

		String res = result(str, team);
		fin = fin + team + ":" + res;

		return fin;
	}

	public static String result(String[] tab, String team) {
		int w = 0;
		int d = 0;
		int l = 0;
		int scored = 0;
		int conceded = 0;
		int score_team = 0;
		int score_other = 0;
		int points = 0;
		int test = 0;
		String res;

		for (int i = 0; i < tab.length; i++) {

			String[] t1 = tab[i].split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

			if (t1[0].replaceAll(" ", "").trim().equals(team.replaceAll(" ", "").trim()))

			{
				test++;

				score_team = Integer.parseInt(t1[1]);
				score_other = Integer.parseInt(t1[3]);

				scored += score_team;
				conceded += score_other;
				if (score_team > score_other) {
					w += 1;
				} else if (score_team < score_other) {
					l += 1;
				} else
					d = +1;
			}

			else if (t1[2].replaceAll(" ", "").trim().equals(team.replaceAll(" ", "").trim())) {

				test++;
				score_other = Integer.parseInt(t1[1]);
				score_team = Integer.parseInt(t1[3]);
				conceded += score_other;
				scored += score_team;

				if (score_team > score_other) {
					w += 1;
				} else if (score_team < score_other) {
					l += 1;
				} else
					d = +1;
			}

		}

		points = 3 * w + d;
		if (test >= 1) {
			res = "W=" + w + ";" + "D=" + d + ";" + "L=" + l + ";" + "Scored=" + scored + ";" + "Conceded=" + conceded
					+ ";" + "Points=" + points;
		} else
			res = "This team didn't play!";

		return res;
	}

	public static boolean verify(String str) {
		String s = str.replaceAll("[\\s+a-zA-Z :]", "");
		if (s.contains("."))
			return false;
		else
			return true;
	}

	public static void main(String[] args) {

		System.out
				.println(nba_cup("Boston Celtics 81 Philadelphia LCclub 65,Los Angeles Clippers 100 Boston Celtics 120",
						"Boston Celtics"));

	}

}
