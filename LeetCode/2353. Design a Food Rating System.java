class FoodRatings {

    class Data{
        String food;
        String cuisine;
        int rating;

        public Data(String food,String cuisine,int rating){
            this.food = food;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }


    class RatingComparator implements Comparator<Data> {
        @Override
        public int compare(Data Data1, Data Data2) {
            if(Data2.rating == Data1.rating){
                return Data1.food.compareToIgnoreCase(Data2.food);
            }else{
                return Integer.compare(Data2.rating, Data1.rating);
            }
        }
    }
    

    HashMap<String,Data> foodMap= new HashMap<>();
    HashMap<String,PriorityQueue<Data>> cusineMap= new HashMap<>();


    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {

        for(int i =0;i<foods.length;i++){
            Data d1 = new Data(foods[i],cuisines[i],ratings[i]);

            foodMap.putIfAbsent(foods[i],d1);

            cusineMap.putIfAbsent(cuisines[i],new PriorityQueue<>(new RatingComparator()));

            if(cusineMap.get(cuisines[i])!=null){
                cusineMap.get(cuisines[i]).add(d1);
                System.out.println(cusineMap.get(cuisines[i]).peek().food);
            }
        }
    }
    
    public void changeRating(String food, int newRating) {
        cusineMap.get(foodMap.get(food).cuisine).remove(foodMap.get(food));
        foodMap.get(food).rating = newRating;
        cusineMap.get(foodMap.get(food).cuisine).add(foodMap.get(food));
    }
    
    public String highestRated(String cuisine) {
        return cusineMap.get(cuisine).peek().food;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */