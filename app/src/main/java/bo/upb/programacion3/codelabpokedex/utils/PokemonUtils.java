package bo.upb.programacion3.codelabpokedex.utils;

import java.util.ArrayList;
import java.util.List;

import bo.upb.programacion3.codelabpokedex.R;
import bo.upb.programacion3.codelabpokedex.model.Pokemon;

public class PokemonUtils {

    /**
     * Get list of pokemons
     *
     * @return List of pokemons in the pokedex
     */
    public static List<Pokemon> getPokemons() {
        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(new Pokemon(1, "Pikachu", R.drawable.pikachu, "Electric"));
        pokemons.add(new Pokemon(2, "Bulbasaur", R.drawable.bulbasaur, "Grass"));
        pokemons.add(new Pokemon(3, "Charmander", R.drawable.charmander, "Fire"));
        pokemons.add(new Pokemon(4, "Squirtle", R.drawable.squirtle, "Water"));
        pokemons.add(new Pokemon(5, "Snorlax", R.drawable.snorlax, "Normal"));
        pokemons.add(new Pokemon(6, "ButterFree", R.drawable.butterfree, "Bug"));
        pokemons.add(new Pokemon(7, "Ekans", R.drawable.ekans, "Poison"));
        pokemons.add(new Pokemon(8, "Pidgey", R.drawable.pidgey, "Normal"));
        pokemons.add(new Pokemon(9, "Rattata", R.drawable.rattata, "Normal"));
        pokemons.add(new Pokemon(10, "Sandshrew", R.drawable.sandshrew, "Ground"));
        pokemons.add(new Pokemon(11, "Venonat", R.drawable.venonat, "Bug"));
        pokemons.add(new Pokemon(12, "Zubat", R.drawable.zubat, "Poison"));
        pokemons.add(new Pokemon(13, "Mewtwo", R.drawable.mewtwo, "Psycho"));
        pokemons.add(new Pokemon(14, "Cubone", R.drawable.cubone, "Ground"));
        pokemons.add(new Pokemon(15, "Audino", R.drawable.audino, "Normal"));
        pokemons.add(new Pokemon(16, "Chansey", R.drawable.chansey, "Normal"));
        pokemons.add(new Pokemon(17, "Chespin", R.drawable.chespin, "Plant"));
        pokemons.add(new Pokemon(18, "Chimchar", R.drawable.chimchar, "Fire"));
        pokemons.add(new Pokemon(19, "Clefable", R.drawable.clefable, "Fairy"));
        pokemons.add(new Pokemon(20, "Cyndaquil", R.drawable.cyndaquil, "Fire"));
        pokemons.add(new Pokemon(21, "Dedenne", R.drawable.dedenne, "Electric"));
        pokemons.add(new Pokemon(22, "Diglett", R.drawable.diglett, "Ground"));
        return pokemons;
    }
}
