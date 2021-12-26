import React from 'react'
import styled from 'styled-components';

const Container = styled.div`
    height: 35px;
    font-size: 15px;
    background-color: orange;
    color: white;
    display : flex;
    align-items: center;
    justify-content: center;    
`;

const Announcement = () => {
    return (
        <div>
            <Container>
                Super Deal! Free shipping to Bulgaria!
            </Container>
        </div>
    )
}

export default Announcement
