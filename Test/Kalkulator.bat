@echo off
setlocal EnableDelayedExpansion
:while
echo --------------------
echo Izaberite opciju 
echo [1] Izracunati novi izraz
echo [2] TOvoriti predhodno sacuvane podatke
echo [3] Izbrisati predhodno sacuvane odatke
echo [4] Izlaz
set izraz=
set rez= 
set opcija= 
set /p opcija=
if %opcija% == 1 (
	echo Unesite izraz:
	set /p izraz=
	set /a "rez=!izraz!"
	echo !rez! >> rezultat.txt
	TIME /t >> rezultat.txt 
) else if %opcija% == 2 (
	if exist rezultat.txt (
		type rezultat.txt
	) else (
		echo Fajl nije kreiran.
	)
) else  if %opcija% == 3 (
	type nul > rezultat.txt 
	echo Zadrzaj dokujmenta je izbrisan.
)else if %opcija% == 4(
	exit
) else (
	echo Opcija ne postoji.
)
goto :while


endlocal

