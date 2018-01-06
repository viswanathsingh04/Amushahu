package com.example.lenovo.viswanath.activity;

/**
 * Created by VPS on 06-01-2018.
 */

public class JSONParse {
    //Declare the arrays of fields you require
    /*public static String[] names;
    public static String[] urls;
    private JSONArray movies = null;
    JSONObject jsonObject;
    List<Data> Movies;
    private String json;

    public JSONParse(String json) {
        this.json = json;
    }

    protected void parseJSON() {
        JSONObject jsonObject = null;
        try {
            movies = new JSONArray(json);
            names = new String[movies.length()];
            urls = new String[movies.length()];
            Movies = new ArrayList<>();

            for (int i = 0; i < movies.length(); i++) {
                Data movie_object = new Data();
                jsonObject = movies.getJSONObject(i);
                names[i] = jsonObject.getString("name");
                urls[i] = jsonObject.getString("url");
                movie_object.setAll_products(names[i]);
                movie_object.setAccount_type(urls[i]);
                Movies.add(movie_object);


            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    List<Data> getMovies() {
        //function to return the final populated list
        return Movies;
    }*/
}
