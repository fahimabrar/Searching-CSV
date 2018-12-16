import pandas as pd
data = pd.read_csv("NCHS_-_Leading_Causes_of_Death__United_States.csv")
df = pd.DataFrame(data)


df.columns = df.columns.str.strip().str.lower().str.replace('-', '_').str.replace(' ', '_').str.replace('(', '').str.replace(')', '')
data.head()

print("For Searching: \nType y for Year\nType c for Cause Name\nType s for State\nType d for Deaths\nType a for age- adjusted death rate")
key = input("Enter your search keys by space ")
search = input("Enter your search here  ")

if key == 's':
    df2 = df.query('state == @search')
    Total = df2['deaths'].sum()
    print ("Total number of death", Total)
    print(df.query('state == @search'))
    
elif key == 'y':
    df2 = df.query('year == @search')
    Total = df2['deaths'].sum()
    print ("Total number of death", Total)
    print(df.query('year == @search'))
    
elif key == 'd':
    df2.query('deaths == @search')
    Total = df2['deaths'].sum()
    print ("Total number of death", Total)
    print(df.query('deaths == @search'))
    
elif key == 'a':
    df2.query('age_adjusted_death_rate == @search')
    Total = df2['deaths'].sum()
    print ("Total number of death", Total)
    print(df.query('age_adjusted_death_rate == @search'))
    
elif key == 'c':
    df2.query('cause_name == @search')
    Total = df2['deaths'].sum()
    print ("Total number of death", Total)
    print(df.query('cause_name == @search'))
    


