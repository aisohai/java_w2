package pl.edu.wszib.lab2.decorator;

public class MultiplyWhenContainTestOrderServiceDecorator extends AbstractOrderServiceDecorator {

    public MultiplyWhenContainTestOrderServiceDecorator(OrderService orderService) {
        super(orderService);
    }

    @Override
    public Integer handle(String name) {
        Integer result = orderService.handle(name);
        if (name.contains("test")) {
            return  result * 2;
        }
        return result;
    }
}
