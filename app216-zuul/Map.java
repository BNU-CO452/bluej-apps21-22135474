
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *  [Pub]<---->[Outside]<---->[Theatre]
 *                 |
 *          [Computer Lab]<---->[Office]
 *             
 * @author  Stefan Allen, " Mohammed Loqman " And " Ben's full name "
 * @version 14/12/2021
 */
public class Map
{
    // Need to add a list of exits
    
    private Location outside, theater, pub, lab, office;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        //createStart();
        //createMainHall();
        //createMainKeyRoom();
        //createPreditorHallway();
        //createPreditorsBasement();
        //createMainHallway1();
        //createMainHallway2();
        //createMainHallway3();
        //createMainHallway4();
        //createMainHallway5();
        //createMainHallway6();
        //createMainHallway7();
        //createLookedDoor();
        //createLootRoom();
        //createVaultDoor();
        //createExit();
        //createKeyCardRoom();
        //createBossRoom();
        //createSecretLootRoomDoor();
        //createSecretLootRoom();

       //currentLocation = Start;  // start game outside
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createOutside()
    {
        outside = new Location("outside the main entrance of the university");
    }
    
    /**
     * Create the pub and link it to the outside
     */
    private void createPub()
    {
        pub = new Location("in the campus pub");
        
        pub.setExit("east", outside);
        outside.setExit("west", pub);
    }
    
    /**
     * Create the theatre linked to the outside
     */
    private void createTheatre()
    {
        theater = new Location("in a lecture theater");
        
        theater.setExit("west", outside);
        outside.setExit("east", theater);
    }
    
    /**
     * Create the office linked to the lab
     */
    private void createOffice()
    {
        office = new Location("in the computing admin office");
        
    }
    
    /**
     * Create the lab and link it to the outside and office
     */
    private void createLab()
    {
        // create the Locations
        lab = new Location("in a computing lab");
        
        lab.setExit("east", office);
        office.setExit("west", lab);
        
        lab.setExit("north", outside);
        outside.setExit("south", lab);
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
