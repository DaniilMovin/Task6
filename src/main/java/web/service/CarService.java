package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private final List<Car> cars ;
    public List<Car> getCarsByCount(Integer count){
        List<Car> result = new ArrayList<>();
        if(count != null ){
        if(count >= cars.size()  ){
            for( Car car : cars){
                result.add(car);
            }
        }else{
            for(int i = 0 ; i < count ; i++ ){
                result.add(cars.get(i));
            }
        }}else{
            for( Car car : cars){
                result.add(car);
            }
        }
        return result ;

    }

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("model",123,"red"));
        cars.add(new Car("model",124,"black"));
        cars.add(new Car("model",125,"white"));
        cars.add(new Car("model",126,"green"));
        cars.add(new Car("model",127,"blue"));
    }

}
