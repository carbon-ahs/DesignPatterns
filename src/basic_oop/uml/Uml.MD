
<b>code snippet -</b>
<h2>Normal Class</h2>
```
public class Shape{
    private int positionX;
    
    public void render()
}
```

<h2>Inheritance</h2>
```
public class Circle extends Shape{

}
```

<h2>Composition</h2>
```
public class Circle{
    private Size size;
}
```
<h2>Dependency</h2>
```
public class Circle{
    private Size size;
    private void render(Document doc){
    }
}
```
UML -

