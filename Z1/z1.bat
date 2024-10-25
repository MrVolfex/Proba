@echo off 
setlocal EnableDelayedExpansion
:while

set opcija=

echo Unesite opciju 
echo [1] Kreiraj textualni fajl Rezultati.txt
echo [2] Upsi rezultate 
echo [3] Broj clanova time
echo [4] Plasman vozaca
echo [5] Pretrazi 
echo [6] Prikazi 
echo [7] Izlaz

set /p opcija=

if !opcija! == 1 (
	if not exist Rezultati.txt (
		echo Rezutlatti trke odrznane u Brazilu novembra 2023 >> Rezultati.txt
	) else (
		echo Fajl vec postoji 
	)
) else if !opcija! == 2 (
	if not exist Rezultati.txt (
		echo Fajl ne psotoji 
	) else (
		for /l %%i in (1 1 5) do (
			set prezime= 
			set tim=
			echo Unesite prezime vozaca 
			set /p prezime=
			echo Unesite tim vozaca
			set /p tim=
			set vozac=!prezime! - tim: !tim! , vreme %date%
			echo !vozac! >> Rezultati.txt
		) 
		
	)
) else if !opcija! == 3 (
	echo Unesite ime tima koje hocete da prebrojite 
	set rec= 
	set /p rec= 
	
	find /c /i "!rec!" "Rezultati.txt" > nuls
	if !errorlevel! equ 0 (
		set brduplikata=0
		
		for /f "tokens=*" %%i in ('findstr "\<!rec!\>" Rezultati.txt') do (
			for %%j in (%%i) do (
				if %%j == "!rec!" (
				
					set /a brduplikata=brduplikata+1
				)
			)
		) 
		echo Broj dupliakta je !brduplikata!
	) else (
		echo rec se ne ponavlaja
	)  
) else if !opcija! == 4 (
	if not exist Rezultati.txt (
		echo Fajl ne psotoji
	) else (
		set broj=1
		for /f "tokens=1" %%i in ( Rezultati.txt ) do (
			echo !broj! %%i >> GeneraniPlasman.txt
			set /a broj=broj+1
        )
	) 
	
) else if !opcija! == 5 (
 	
		rem i ovde sam uradio nesto ali mi je pravilo grsku pa sam morao da ga obrisem 
	
) else if !opcija! == 6 (
	type Rezultati.txt 
	echo %date% %time%

) else if !opcija! == 7 (
	exit 
) else (
	echo Pogresna opcija 
)

goto while
endlocal
