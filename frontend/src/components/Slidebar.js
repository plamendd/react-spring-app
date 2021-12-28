import React from 'react'
import styled from 'styled-components';
import { ArrowLeftOutlined, ArrowRightAltOutlined } from '@material-ui/icons';

const Container = styled.div`
    height: 35px;
    font-size: 15px;
    background-color: orange;
    color: white;
    display : flex;
    align-items: center;
    justify-content: center;    
`;

const Arrow = styled.div`
    width: 55px;
    height:55px;
    border-radius: 50%;
    background-color: white; 
`;

const Slidebar = () => {
    return (
       <Container>
           <Arrow>
                <ArrowLeftOutlined/>
           </Arrow>
           <Arrow>
                <ArrowRightAltOutlined/>
           </Arrow>
       </Container>
    )
}

export default Slidebar
