package fr.diginamic.jdr;

public class Troll extends Enemy
{
	public static final int STR_MIN = 10;
	public static final int STR_MAX = 15;
	public static final int HP_MIN = 20;
	public static final int HP_MAX = 30;
	public static final int SCORE = 5;
	
	public Troll()
	{
		super(STR_MIN, STR_MAX, HP_MIN, HP_MAX);
	}

	public int getScore()
	{
		return SCORE;
	}
	
	public void spriteDisplay()
	{
		System.out.println(
				  "                                   Troll                                        \r\n"
				+ "                                   /                                            \r\n"
				+ "                                 ,,//   *,,                                     \r\n"
				+ "                                *//(⣿%⣿⣿⣿(/(⣿(                                  \r\n"
				+ "                               ⣿⣿%⣿⣿(⣿⣿%%%⣿(⣿⣿%(,                               \r\n"
				+ "                              ⣿⣿⣿(⣿%⣿⣿%%%%%&%%%%%,                              \r\n"
				+ "                              %(⣿((⣿((%%⣿&/%⣿&&&&%*                             \r\n"
				+ "                    */⣿⣿⣿%%%&⣿(((%%⣿*%%%&%&⣿%@&%%%&(                            \r\n"
				+ "                  ⣿⣿⣿(⣿%⣿%&&%%/⣿/((/*⣿(((⣿⣿**%⣿⣿⣿%&%%⣿(⣿(,                      \r\n"
				+ "                 &&&%%%%&&&&%*⣿⣿%⣿(⣿⣿⣿⣿((⣿⣿(* /⣿&&&⣿⣿⣿⣿((⣿⣿⣿⣿%*                 \r\n"
				+ "              ,%%%&%%⣿((⣿⣿&&(⣿%&@@@&&&&⣿⣿⣿⣿⣿/*/(%&&&&&&%%%%%&&&&&%%&,           \r\n"
				+ "            (%@(⣿%%&&%%&&&&&(*%/@@&⣿%(&&%⣿%(*(%%&&%⣿((⣿⣿%⣿%%&&%%⣿⣿&&%⣿/         \r\n"
				+ "          (%&%%%%(⣿⣿%%&&&&%⣿⣿(⣿&⣿%//(*%/⣿&*⣿%%%&&&%⣿%%⣿%%%&&&%&%⣿%&%&&⣿⣿/       \r\n"
				+ "        *%&⣿%%%⣿(&&%%&⣿,  *⣿*(*/%(⣿%%⣿*⣿%⣿⣿(/⣿⣿%⣿%&&&%((/⣿%%⣿⣿((%%%%(⣿%&%⣿      \r\n"
				+ "       ⣿%(%⣿%%%⣿%&%&%*    //*⣿((((⣿⣿⣿⣿⣿(((//*⣿(⣿%%%*/(/       (%⣿%%⣿%(⣿⣿/((     \r\n"
				+ "      ,(⣿%(%%%%%&&⣿,      //**%⣿⣿⣿%%%(/%⣿(((*/(%&%%%,,*((,      %%%⣿⣿%%%⣿⣿%*    \r\n"
				+ "      ⣿%&%%%%&&(,         ,,, /(/*/(((((((⣿(*//⣿%%%⣿⣿&%⣿,         %%⣿%&&%%(%,   \r\n"
				+ "    */⣿%&%%%%%%%*          /**,/*,,*/*,,**/,,,*%%%%⣿&&%%%,      ⣿%%%&⣿⣿(**/((   \r\n"
				+ "   (⣿%%⣿(⣿⣿⣿(⣿((/(        &&⣿/⣿*/***(/*,,*/,***%%%&&&&%%⣿%/   ((⣿⣿⣿⣿⣿⣿%%%%⣿⣿%%, \r\n"
				+ "  ((/(((%&%⣿*,(//%/      /(⣿⣿%***((((⣿(/(((//*%&%&&&&%%&⣿(%*,(⣿⣿(@&((*/(//(/((((\r\n"
				+ " /((/((&(      (⣿%(       ⣿⣿⣿⣿%%/*%⣿⣿⣿⣿⣿(⣿**/&&&&&%&%%%%%(&/(⣿⣿&(  (⣿/&⣿(,(⣿*(((\r\n"
				+ " ⣿(((((%/                  ((⣿⣿%&%/⣿*⣿%%%%*/&&⣿/, (&%%%(⣿%&/,⣿⣿*  (⣿/⣿%/(*(///((\r\n"
				+ "  ⣿(⣿%&%*                   ,%&%%⣿%&/    ,*⣿,       *⣿%%&%&(      ,(%&⣿/⣿%⣿/⣿%⣿%\r\n"
				+ "   ,,                         ⣿⣿%&&%%*    *          &%⣿/((⣿⣿,         /%%&//((*\r\n"
				+ "                           ⣿⣿%%%%%%&%*               ⣿⣿%%⣿(⣿⣿⣿/                 \r\n"
				+ "                         ((((⣿(&%(&/                  ⣿(/⣿(⣿%&&(                \r\n"
				+ "                      *⣿⣿(⣿(⣿((⣿⣿%⣿                     ,,                      \r\n"
				+ "                      ⣿⣿⣿(((⣿⣿%&&⣿,                                             \r\n"
				+ "");
	}
}
