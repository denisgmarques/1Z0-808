for a in *.java
do
        { echo "package Chapter3;"; cat $a; } >$a.new
	mv $a{.new,}
done

