package fr.diginamic.jdr;

public class Goblin extends Enemy
{
	public static final int STR_MIN = 5;
	public static final int STR_MAX = 10;
	public static final int HP_MIN = 10;
	public static final int HP_MAX = 15;
	public static final int SCORE = 2;
	
	public Goblin()
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
				    "                                  Goblin                                        \r\n"
				  + "                                   /   /                         /#/            \r\n"
				  + "         #%(                     %%%%%(%#@&*(                #(%(.              \r\n"
				  + "           ##%((,           ,&%%##((/#%(##/,&&%&&     ,#((//%(#%                \r\n"
				  + "            ,####%//(#  &&&%%%%%#((////*#(##%&%%%&&#%%%%&%#%#&                  \r\n"
				  + "               %##%%%%#/(%%&#%%%%##(#(((((#%%%%&%%&&&%&%%%&                     \r\n"
				  + "                 ((((%%%&(%%%%#%(/(#%###%%%%%%&&%/&#@%%##.                      \r\n"
				  + "                    (((%&(%#%%##%&#/*#%%%/&&#%&&/%#%%#%(                        \r\n"
				  + "                    /%%#%&&#%#(#%%##%%%#,,/((#*##%%/%&                          \r\n"
				  + "                    */  #%&%%%#((/*,/**,*%&((%%((*/(%%    (/  #/,.              \r\n"
				  + "                        .%%%#%/@%%((((///*(((((#%&@/&% .###%(((///((#%,%#%      \r\n"
				  + "             /*#( ((,*/(%%&%%%##(%&@%&*&.#,&(&&&&(%%&&((((##(/**,/*//((((###%(  \r\n"
				  + " %//#%%#&&#&%&&&//&##%###%%%%%&&%#%(&#&*&%&*&/%#%&&##&%&&%               #&%#%%*\r\n"
				  + " #%%%%#%&&@/&%%##%  %    &  &#&&&&&&%%#,*%%%&(%  */  %%                         \r\n"
				  + "             ###/(      ,%(/#&#@&%&%%&&&%%%%%&#/(%.   #.                        \r\n"
				  + "             ##(%/%%/*/*%((##&/(&&#/**(###%&&&&%(*/##%                          \r\n"
				  + "             %%(#(#%%//(%%%&&&%#&&&&%##%#%%/% %%%%#%&(((%                       \r\n"
				  + "              &&#%%&&%*(    @&%&&@%#(%#%%#%%%&    /%#%#%&                       \r\n"
				  + "                    (        &%@&###%%%&&&&&%&@   #%*/%&                        \r\n"
				  + "                    ,        &@&&&&@%&@&&%&&&&%%%%#*(%.                         \r\n"
				  + "                            %%&%&%&&&#&%%&@@@@%%%&%&.                           \r\n"
				  + "                        %*#&@&&%%&&%&(((&%&@@&&@#%%                             \r\n"
				  + "                     && & *##&&%&#(#####&%%%&@@&&&&@                            \r\n"
				  + "                     &(*/#&%%%%&##%%@%,%&%%%%%%##%%@@                           \r\n"
				  + "                   # %*&#%&&%%###%%&&&&&&&%%&&%%%%&&&&                          \r\n"
				  + "                   #%###%%%(#%%%%%&%%&(&&&&&@&&&%%/*/(&&&                       \r\n"
				  + "                   # ,#(((#%%%@%%&&###&&&&&&@&&%%##(((&% &                      \r\n"
				  + "                 (  (%%#%#(#&  &&*&%###%%&&&%   &%(%%%%%%                       \r\n"
				  + "                    &%%#%%&&&, ,( %#%###%%&     &%%####%%                       \r\n"
				  + "                    &%##(#%&&,  ,    (##%%      %%(#/((%&                       \r\n"
				  + "                    &##%##%%&         (%&/      &%&%%%&%&                       \r\n"
				  + "                    &%#(##%%&         (%        &%#%%&&&&                       \r\n"
				  + "                  /%%##%#%&@@          #        &%%&%%####&%                    \r\n"
				  + "                %%%&%%@#%%&&@                  .&&&&%%%&#%&%##%%&&&             \r\n"
				  + "           %%@#&%&%%&%%&%                            / &&&&&%&@@ #              \r\n"
				  + "                * &                                                             ");
	}
}
