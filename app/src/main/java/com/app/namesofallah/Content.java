package com.app.Sub_headingofallah;

import java.util.ArrayList;

/**
 * Created by Krishna on 02-05-2015.
 */
public class Content {

    public static ArrayList<String> Names;
    public static ArrayList<String> Images;
    public static ArrayList<String> Audio;

    public static ArrayList<String> Sub_heading;
    public static ArrayList<String> Description;


    Content(){
        this.Names = new ArrayList<String>();
        this.Sub_heading = new ArrayList<String>();
        this.Images = new ArrayList<String>();
        this.Audio = new ArrayList<String>();

        this.Names.add(0,"Allah");
        this.Names.add(1,"Ar-Rahmaan");
        this.Names.add(2,"Ar-Raheem");
        this.Names.add(3,"Al-Malik");
        this.Names.add(4,"Al-Quddoos");
        this.Names.add(5,"As-Salaam");
        this.Names.add(6,"Al-Mu'min");
        this.Names.add(7,"Al-Muhaymin");
        this.Names.add(8,"Al-'Azeez");
        this.Names.add(9,"Al-Jabbaar");
        this.Names.add(10,"Al-Mutakabbir");
        this.Names.add(11,"Al-Khaaliq");
        this.Names.add(12,"Al-Baari'");
        this.Names.add(13,"Al-Musawwir");
        this.Names.add(14,"Al-Ghaffaar");
        this.Names.add(15,"Al-Qahhaar");
        this.Names.add(16,"Al-Wahhaab");
        this.Names.add(17,"Ar-Razzaaq");
        this.Names.add(18,"Al-Fattaah");
        this.Names.add(19,"Al-'Aleem");
        this.Names.add(20,"Al-Qaabid");
        this.Names.add(21,"Al-Baasit");
        this.Names.add(22,"Al-Khaafid");
        this.Names.add(23,"Ar-Raafi'");
        this.Names.add(24,"Al-Mu'iz");
        this.Names.add(25,"Al-Baa'ith");
        this.Names.add(26,"Ash-Shaheed");
        this.Names.add(27,"Al-Haqq");
        this.Names.add(28,"Al-Wakeel");
        this.Names.add(29,"Al-Qawiyy");
        this.Names.add(30,"Al-Mateen");
        this.Names.add(31,"Al-Waliyy");
        this.Names.add(32,"Al-Hameed");
        this.Names.add(33,"Al-Muhsee");
        this.Names.add(34,"Al-Mubdi'");
        this.Names.add(35,"Al-Mu'eed");
        this.Names.add(36,"Al-Muhyee");
        this.Names.add(37,"Al-Mumeet");
        this.Names.add(38,"Al-Hayy");
        this.Names.add(39,"Al-Qayyoom");
        this.Names.add(40,"Al-Waajid");
        this.Names.add(41,"Al-Maajid");
        this.Names.add(42,"Al-Waahid");
        this.Names.add(43,"As-Samad");
        this.Names.add(44,"Al-Qaadir");
        this.Names.add(45,"Al-Muqtadir");
        this.Names.add(46,"Al-Muqaddim");
        this.Names.add(47,"Al-Mu'akhkhir");
        this.Names.add(48,"Al-Awwal");
        this.Names.add(49,"Al-Aakhir");
        this.Names.add(50,"Al-Mudhil");
        this.Names.add(51,"As-Sami'");
        this.Names.add(52,"Al-Baseer");
        this.Names.add(53,"Al-Hakam");
        this.Names.add(54,"Al-'Adl");
        this.Names.add(55,"Al-Lateef");
        this.Names.add(56,"Al-Khabeer");
        this.Names.add(57,"Al-Haleem");
        this.Names.add(58,"Al-'Azeem");
        this.Names.add(59,"Al-Ghafoor");
        this.Names.add(60,"Ash-Shakoor");
        this.Names.add(61,"Al-'Aliyy");
        this.Names.add(62,"Al-Kabeer");
        this.Names.add(63,"Al-Hafeez");
        this.Names.add(64,"Al-Muqeet");
        this.Names.add(65,"Al-Haseeb");
        this.Names.add(66,"Al-Jaleel");
        this.Names.add(67,"Al-Kareem");
        this.Names.add(68,"Ar-Raqeeb");
        this.Names.add(69,"Al-Mujeeb");
        this.Names.add(70,"Al-Waasi'");
        this.Names.add(71,"Al-Hakeem");
        this.Names.add(72,"Al-Wadood");
        this.Names.add(73,"Al-Majeed");
        this.Names.add(74,"Az-Zaahir");
        this.Names.add(75,"Al-Baatin");
        this.Names.add(76,"Al-Waalee");
        this.Names.add(77,"Al-Muta'aalee");
        this.Names.add(78,"Al-Barr");
        this.Names.add(79,"At-Tawwaab");
        this.Names.add(80,"Al-Muntaqim");
        this.Names.add(81,"Al-'Afuww");
        this.Names.add(82,"Ar-Ra'oof");
        this.Names.add(83,"Maalik-ul-Mulk");
        this.Names.add(84,"Dhul-Jalaali \n Wal-Ikraam");
        this.Names.add(85,"Al-Muqsit");
        this.Names.add(86,"Al-Jaami'");
        this.Names.add(87,"Al-Ghaniyy");
        this.Names.add(88,"Al-Mughnee");
        this.Names.add(89,"Al-Maani'");
        this.Names.add(90,"Ad-Daar");
        this.Names.add(91,"An-Naafi'");
        this.Names.add(92,"An-Noor");
        this.Names.add(93,"Al-Haadee");
        this.Names.add(94,"Al-Badee'");
        this.Names.add(95,"Al-Baaqee");
        this.Names.add(96,"Al-Waarith");
        this.Names.add(97,"Ar-Rasheed");
        this.Names.add(98,"As-Saboor");
       


        this.Audio.add(0,"null");
        for(int i=1;i<99;i++){
            this.Audio.add(i,"audio"+i);
        }

        for(int j=1;j<=100;j++){
            this.Images.add(j-1,"name"+j+"_small");
        }


        this.Sub_heading.add(0,"The Name of Allah");
        this.Sub_heading.add(1,"The Most Compassionate, The Beneficent, The Gracious");
        this.Sub_heading.add(2,"The Most Merciful");
        this.Sub_heading.add(3,"The Sovereign, The King");
        this.Sub_heading.add(4,"The Most Holy");
        this.Sub_heading.add(5,"The Bestower of Peace, The All-Peaceful");
        this.Sub_heading.add(6,"The Granter of Security");
        this.Sub_heading.add(7,"The Protector");
        this.Sub_heading.add(8,"The Mighty");
        this.Sub_heading.add(9,"The Compeller");
        this.Sub_heading.add(10,"The Majestic, Supreme in Greatness");

        this.Sub_heading.add(11,"The Creator");
        this.Sub_heading.add(12,"The Maker");
        this.Sub_heading.add(13,"The Fashioner of Forms, The Shaper");
        this.Sub_heading.add(14,"The Forgiver");
        this.Sub_heading.add(15,"The Subduer");
        this.Sub_heading.add(16,"The Bestower");
        this.Sub_heading.add(17,"The Provider");
        this.Sub_heading.add(18,"The Opener, The Judge");
        this.Sub_heading.add(19,"The All-Knowing");
        this.Sub_heading.add(20,"The Withholder");
        this.Sub_heading.add(21,"The Expander");
        this.Sub_heading.add(22,"The Abaser");
        this.Sub_heading.add(23,"The Exalter");
        this.Sub_heading.add(24,"The Bestower of Honor");
        this.Sub_heading.add(25,"The Resurrector");
        this.Sub_heading.add(26,"The Witness");
        this.Sub_heading.add(27,"The Truth");
        this.Sub_heading.add(28,"The Trustee, The Ultimate Trustee, The Disposer of Affairs");
        this.Sub_heading.add(29,"The Most Strong");
        this.Sub_heading.add(30,"The Firm, The Firm One, The Authoritative");
        this.Sub_heading.add(31,"The Patron, The Protector");
        this.Sub_heading.add(32,"The Praiseworthy, The All-Praised");
        this.Sub_heading.add(33,"The Reckoner");
        this.Sub_heading.add(34,"The Originator");
        this.Sub_heading.add(35,"The Restorer");
        this.Sub_heading.add(36,"The Giver of Life");
        this.Sub_heading.add(37,"The Giver of Death");
        this.Sub_heading.add(38,"The Ever-Living");
        this.Sub_heading.add(39,"The Self-Subsisting Sustainer of All");
        this.Sub_heading.add(40,"The Finder, The Self-Sufficient, The All-Perceiving");
        this.Sub_heading.add(41,"The Glorious");
        this.Sub_heading.add(42,"The One");
        this.Sub_heading.add(43,"The Eternally Besought");
        this.Sub_heading.add(44,"The Omnipotent, The Able");
        this.Sub_heading.add(45,"The Powerful");
        this.Sub_heading.add(46,"The Expediter");
        this.Sub_heading.add(47,"The Delayer");
        this.Sub_heading.add(48,"The First");
        this.Sub_heading.add(49,"The Last");
        this.Sub_heading.add(50,"The Humiliator");
        this.Sub_heading.add(51,"The All-Hearing");
        this.Sub_heading.add(52,"The All-Seeing");
        this.Sub_heading.add(53,"The Judge");
        this.Sub_heading.add(54,"The Just, The Equitable");
        this.Sub_heading.add(55,"The Most Affectionate, The Knower of Subtleties, The Gentle");
        this.Sub_heading.add(56,"The All-Aware");
        this.Sub_heading.add(57,"The Forbearing");
        this.Sub_heading.add(58,"The Magnificient, The Incomparably Great");
        this.Sub_heading.add(59,"The Forgiving");
        this.Sub_heading.add(60,"The Grateful, The Appreciative");

        this.Sub_heading.add(61,"The Highest");
        this.Sub_heading.add(62,"The Greatest");
        this.Sub_heading.add(63,"The Preserver");
        this.Sub_heading.add(64,"The Sustainer");
        this.Sub_heading.add(65,"The Reckoner");
        this.Sub_heading.add(66,"The Exalted, The Majestic, The Revered, The Sublime");
        this.Sub_heading.add(67,"The Generous");
        this.Sub_heading.add(68,"The Watchful");
        this.Sub_heading.add(69,"The Responsive");
        this.Sub_heading.add(70,"The All-Encompassing, The All-Embracing");
        this.Sub_heading.add(71,"The Wise");
        this.Sub_heading.add(72,"The Most Loving, The Loving One");
        this.Sub_heading.add(73,"The Most Glorious");
        this.Sub_heading.add(74,"The Manifest");
        this.Sub_heading.add(75,"The Hidden");
        this.Sub_heading.add(76,"The Governer, The Protector");
        this.Sub_heading.add(77,"The Most Exalted");
        this.Sub_heading.add(78,"The Source of All Goodness, The Benign");
        this.Sub_heading.add(79,"The Acceptor of Repentance");
        this.Sub_heading.add(80,"The Avenger, The Lord of Retribution");

        this.Sub_heading.add(81,"The Pardoner");
        this.Sub_heading.add(82,"The Most Kind, The Clement");
        this.Sub_heading.add(83,"The Owner of Sovereignity, Owner of the Kingdom");
        this.Sub_heading.add(84,"Majestic and Benevolent, Possessor of Majesty and Honour");
        this.Sub_heading.add(85,"The Just, The Equitable");
        this.Sub_heading.add(86,"The Gatherer");
        this.Sub_heading.add(87,"The Self-Sufficient");
        this.Sub_heading.add(88,"The Enricher");
        this.Sub_heading.add(89,"The Preventer of Harm");
        this.Sub_heading.add(90,"The Distresser, The Afflicter");
        this.Sub_heading.add(91,"The Propitious, The Benefiter");
        this.Sub_heading.add(92,"The Light");
        this.Sub_heading.add(93,"The Guide");
        this.Sub_heading.add(94,"The Originator");
        this.Sub_heading.add(95,"The Everlasting");
        this.Sub_heading.add(96,"The Ultimate Inheritor");
        this.Sub_heading.add(97,"The Guide to the Right Path");
        this.Sub_heading.add(98,"The Patient One");

    }

}
