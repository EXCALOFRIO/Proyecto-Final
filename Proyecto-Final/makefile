compilar:limpiar
	mkdir bin
	find src -name *.java | xargs javac -cp bin -d bin	
ejecutar:compilar
	java -cp bin aplicacion.Interfaz
limpiar:
	rm -rf bin
jar:compilar
	jar cvfm libreta.jar Manifest.txt -C bin .
