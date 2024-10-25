@echo off 
echo unesite opciju 1 ili 2 
set /p opcija=

if %opcija% equ 1 (
	echo prva opcija
) else if %opcija% GTR 2 (
	echo opcija 2
) else (
	echo pogresna opcija
)
Pause > nul 



