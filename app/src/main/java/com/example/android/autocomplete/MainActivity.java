package com.example.android.autocomplete;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;
    String  countries = "Afghanistan\n" +
            "\n" +
            "Albania\n" +
            "\n" +
            "Algeria\n" +
            "\n" +
            "American Samoa\n" +
            "\n" +
            "Andorra\n" +
            "\n" +
            "Angola\n" +
            "\n" +
            "Anguilla\n" +
            "\n" +
            "Antarctica\n" +
            "\n" +
            "Antigua and Barbuda\n" +
            "\n" +
            "Argentina\n" +
            "\n" +
            "Armenia\n" +
            "\n" +
            "Aruba\n" +
            "\n" +
            "Australia\n" +
            "\n" +
            "Austria\n" +
            "\n" +
            "Azerbaijan\n" +
            "\n" +
            "Bahamas\n" +
            "\n" +
            "Bahrain\n" +
            "\n" +
            "Bangladesh\n" +
            "\n" +
            "Barbados\n" +
            "\n" +
            "Belarus\n" +
            "\n" +
            "Belgium\n" +
            "\n" +
            "Belize\n" +
            "\n" +
            "Benin\n" +
            "\n" +
            "Bermuda\n" +
            "\n" +
            "Bhutan\n" +
            "\n" +
            "Bolivia\n" +
            "\n" +
            "Bosnia and Herzegovina\n" +
            "\n" +
            "Botswana\n" +
            "\n" +
            "Bouvet Island\n" +
            "\n" +
            "Brazil\n" +
            "\n" +
            "British Antarctic Territory\n" +
            "\n" +
            "British Indian Ocean Territory\n" +
            "\n" +
            "British Virgin Islands\n" +
            "\n" +
            "Brunei\n" +
            "\n" +
            "Bulgaria\n" +
            "\n" +
            "Burkina Faso\n" +
            "\n" +
            "Burundi\n" +
            "\n" +
            "Cambodia\n" +
            "\n" +
            "Cameroon\n" +
            "\n" +
            "Canada\n" +
            "\n" +
            "Canton and Enderbury Islands\n" +
            "\n" +
            "Cape Verde\n" +
            "\n" +
            "Cayman Islands\n" +
            "\n" +
            "Central African Republic\n" +
            "\n" +
            "Chad\n" +
            "\n" +
            "Chile\n" +
            "\n" +
            "China\n" +
            "\n" +
            "Christmas Island\n" +
            "\n" +
            "Cocos [Keeling] Islands\n" +
            "\n" +
            "Colombia\n" +
            "\n" +
            "Comoros\n" +
            "\n" +
            "Congo - Brazzaville\n" +
            "\n" +
            "Congo - Kinshasa\n" +
            "\n" +
            "Cook Islands\n" +
            "\n" +
            "Costa Rica\n" +
            "\n" +
            "Croatia\n" +
            "\n" +
            "Cuba\n" +
            "\n" +
            "Cyprus\n" +
            "\n" +
            "Czech Republic\n" +
            "\n" +
            "Côte d’Ivoire\n" +
            "\n" +
            "Denmark\n" +
            "\n" +
            "Djibouti\n" +
            "\n" +
            "Dominica\n" +
            "\n" +
            "Dominican Republic\n" +
            "\n" +
            "Dronning Maud Land\n" +
            "\n" +
            "East Germany\n" +
            "\n" +
            "Ecuador\n" +
            "\n" +
            "Egypt\n" +
            "\n" +
            "El Salvador\n" +
            "\n" +
            "Equatorial Guinea\n" +
            "\n" +
            "Eritrea\n" +
            "\n" +
            "Estonia\n" +
            "\n" +
            "Ethiopia\n" +
            "\n" +
            "Falkland Islands\n" +
            "\n" +
            "Faroe Islands\n" +
            "\n" +
            "Fiji\n" +
            "\n" +
            "Finland\n" +
            "\n" +
            "France\n" +
            "\n" +
            "French Guiana\n" +
            "\n" +
            "French Polynesia\n" +
            "\n" +
            "French Southern Territories\n" +
            "\n" +
            "French Southern and Antarctic Territories\n" +
            "\n" +
            "Gabon\n" +
            "\n" +
            "Gambia\n" +
            "\n" +
            "Georgia\n" +
            "\n" +
            "Germany\n" +
            "\n" +
            "Ghana\n" +
            "\n" +
            "Gibraltar\n" +
            "\n" +
            "Greece\n" +
            "\n" +
            "Greenland\n" +
            "\n" +
            "Grenada\n" +
            "\n" +
            "Guadeloupe\n" +
            "\n" +
            "Guam\n" +
            "\n" +
            "Guatemala\n" +
            "\n" +
            "Guernsey\n" +
            "\n" +
            "Guinea\n" +
            "\n" +
            "Guinea-Bissau\n" +
            "\n" +
            "Guyana\n" +
            "\n" +
            "Haiti\n" +
            "\n" +
            "Heard Island and McDonald Islands\n" +
            "\n" +
            "Honduras\n" +
            "\n" +
            "Hong Kong SAR China\n" +
            "\n" +
            "Hungary\n" +
            "\n" +
            "Iceland\n" +
            "\n" +
            "India\n" +
            "\n" +
            "Indonesia\n" +
            "\n" +
            "Iran\n" +
            "\n" +
            "Iraq\n" +
            "\n" +
            "Ireland\n" +
            "\n" +
            "Isle of Man\n" +
            "\n" +
            "Israel\n" +
            "\n" +
            "Italy\n" +
            "\n" +
            "Jamaica\n" +
            "\n" +
            "Japan\n" +
            "\n" +
            "Jersey\n" +
            "\n" +
            "Johnston Island\n" +
            "\n" +
            "Jordan\n" +
            "\n" +
            "Kazakhstan\n" +
            "\n" +
            "Kenya\n" +
            "\n" +
            "Kiribati\n" +
            "\n" +
            "Kuwait\n" +
            "\n" +
            "Kyrgyzstan\n" +
            "\n" +
            "Laos\n" +
            "\n" +
            "Latvia\n" +
            "\n" +
            "Lebanon\n" +
            "\n" +
            "Lesotho\n" +
            "\n" +
            "Liberia\n" +
            "\n" +
            "Libya\n" +
            "\n" +
            "Liechtenstein\n" +
            "\n" +
            "Lithuania\n" +
            "\n" +
            "Luxembourg\n" +
            "\n" +
            "Macau SAR China\n" +
            "\n" +
            "Macedonia\n" +
            "\n" +
            "Madagascar\n" +
            "\n" +
            "Malawi\n" +
            "\n" +
            "Malaysia\n" +
            "\n" +
            "Maldives\n" +
            "\n" +
            "Mali\n" +
            "\n" +
            "Malta\n" +
            "\n" +
            "Marshall Islands\n" +
            "\n" +
            "Martinique\n" +
            "\n" +
            "Mauritania\n" +
            "\n" +
            "Mauritius\n" +
            "\n" +
            "Mayotte\n" +
            "\n" +
            "Metropolitan France\n" +
            "\n" +
            "Mexico\n" +
            "\n" +
            "Micronesia\n" +
            "\n" +
            "Midway Islands\n" +
            "\n" +
            "Moldova\n" +
            "\n" +
            "Monaco\n" +
            "\n" +
            "Mongolia\n" +
            "\n" +
            "Montenegro\n" +
            "\n" +
            "Montserrat\n" +
            "\n" +
            "Morocco\n" +
            "\n" +
            "Mozambique\n" +
            "\n" +
            "Myanmar [Burma]\n" +
            "\n" +
            "Namibia\n" +
            "\n" +
            "Nauru\n" +
            "\n" +
            "Nepal\n" +
            "\n" +
            "Netherlands\n" +
            "\n" +
            "Netherlands Antilles\n" +
            "\n" +
            "Neutral Zone\n" +
            "\n" +
            "New Caledonia\n" +
            "\n" +
            "New Zealand\n" +
            "\n" +
            "Nicaragua\n" +
            "\n" +
            "Niger\n" +
            "\n" +
            "Nigeria\n" +
            "\n" +
            "Niue\n" +
            "\n" +
            "Norfolk Island\n" +
            "\n" +
            "North Korea\n" +
            "\n" +
            "North Vietnam\n" +
            "\n" +
            "Northern Mariana Islands\n" +
            "\n" +
            "Norway\n" +
            "\n" +
            "Oman\n" +
            "\n" +
            "Pacific Islands Trust Territory\n" +
            "\n" +
            "Pakistan\n" +
            "\n" +
            "Palau\n" +
            "\n" +
            "Palestinian Territories\n" +
            "\n" +
            "Panama\n" +
            "\n" +
            "Panama Canal Zone\n" +
            "\n" +
            "Papua New Guinea\n" +
            "\n" +
            "Paraguay\n" +
            "\n" +
            "People's Democratic Republic of Yemen\n" +
            "\n" +
            "Peru\n" +
            "\n" +
            "Philippines\n" +
            "\n" +
            "Pitcairn Islands\n" +
            "\n" +
            "Poland\n" +
            "\n" +
            "Portugal\n" +
            "\n" +
            "Puerto Rico\n" +
            "\n" +
            "Qatar\n" +
            "\n" +
            "Romania\n" +
            "\n" +
            "Russia\n" +
            "\n" +
            "Rwanda\n" +
            "\n" +
            "Réunion\n" +
            "\n" +
            "Saint Barthélemy\n" +
            "\n" +
            "Saint Helena\n" +
            "\n" +
            "Saint Kitts and Nevis\n" +
            "\n" +
            "Saint Lucia\n" +
            "\n" +
            "Saint Martin\n" +
            "\n" +
            "Saint Pierre and Miquelon\n" +
            "\n" +
            "Saint Vincent and the Grenadines\n" +
            "\n" +
            "Samoa\n" +
            "\n" +
            "San Marino\n" +
            "\n" +
            "Saudi Arabia\n" +
            "\n" +
            "Senegal\n" +
            "\n" +
            "Serbia\n" +
            "\n" +
            "Serbia and Montenegro\n" +
            "\n" +
            "Seychelles\n" +
            "\n" +
            "Sierra Leone\n" +
            "\n" +
            "Singapore\n" +
            "\n" +
            "Slovakia\n" +
            "\n" +
            "Slovenia\n" +
            "\n" +
            "Solomon Islands\n" +
            "\n" +
            "Somalia\n" +
            "\n" +
            "South Africa\n" +
            "\n" +
            "South Georgia and the South Sandwich Islands\n" +
            "\n" +
            "South Korea\n" +
            "\n" +
            "Spain\n" +
            "\n" +
            "Sri Lanka\n" +
            "\n" +
            "Sudan\n" +
            "\n" +
            "Suriname\n" +
            "\n" +
            "Svalbard and Jan Mayen\n" +
            "\n" +
            "Swaziland\n" +
            "\n" +
            "Sweden\n" +
            "\n" +
            "Switzerland\n" +
            "\n" +
            "Syria\n" +
            "\n" +
            "São Tomé and Príncipe\n" +
            "\n" +
            "Taiwan\n" +
            "\n" +
            "Tajikistan\n" +
            "\n" +
            "Tanzania\n" +
            "\n" +
            "Thailand\n" +
            "\n" +
            "Timor-Leste\n" +
            "\n" +
            "Togo\n" +
            "\n" +
            "Tokelau\n" +
            "\n" +
            "Tonga\n" +
            "\n" +
            "Trinidad and Tobago\n" +
            "\n" +
            "Tunisia\n" +
            "\n" +
            "Turkey\n" +
            "\n" +
            "Turkmenistan\n" +
            "\n" +
            "Turks and Caicos Islands\n" +
            "\n" +
            "Tuvalu\n" +
            "\n" +
            "U.S. Minor Outlying Islands\n" +
            "\n" +
            "U.S. Miscellaneous Pacific Islands\n" +
            "\n" +
            "U.S. Virgin Islands\n" +
            "\n" +
            "Uganda\n" +
            "\n" +
            "Ukraine\n" +
            "\n" +
            "Union of Soviet Socialist Republics\n" +
            "\n" +
            "United Arab Emirates\n" +
            "\n" +
            "United Kingdom\n" +
            "\n" +
            "United States\n" +
            "\n" +
            "Unknown or Invalid Region\n" +
            "\n" +
            "Uruguay\n" +
            "\n" +
            "Uzbekistan\n" +
            "\n" +
            "Vanuatu\n" +
            "\n" +
            "Vatican City\n" +
            "\n" +
            "Venezuela\n" +
            "\n" +
            "Vietnam\n" +
            "\n" +
            "Wake Island\n" +
            "\n" +
            "Wallis and Futuna\n" +
            "\n" +
            "Western Sahara\n" +
            "\n" +
            "Yemen\n" +
            "\n" +
            "Zambia\n" +
            "\n" +
            "Zimbabwe\n" +
            "\n" +
            "Åland Islands\n";
    String [] allCountries = countries.split("\n\n");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this,  android.R.layout.select_dialog_item, allCountries);
        //you can pass a String array!
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);
    }
}
